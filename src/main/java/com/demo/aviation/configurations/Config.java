package com.demo.aviation.configurations;

import com.demo.aviation.configurations.properties.AviationAcademyProperties;

import com.demo.aviation.persistence.models.AircraftModel;
import com.demo.aviation.persistence.models.StudentModel;
import com.demo.aviation.persistence.repositories.AircraftRepository;
import com.demo.aviation.persistence.repositories.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import java.util.List;
import java.util.stream.Collectors;

@Configuration
@EnableMongoRepositories(basePackages = "com.demo.aviation.persistence.repositories")
public class Config {

    Logger logger = LoggerFactory.getLogger(Config.class);;

    @Autowired
    AircraftRepository aircraftRepository;

    @Autowired
    StudentRepository studentRepository;

    @Bean
    AviationAcademyProperties aviationAcademyProperties(){
        return new AviationAcademyProperties();
    }

    @Bean
    public List<?> migrateAircrafts(AviationAcademyProperties aviationAcademyProperties){
        logger.info("Migrating Aircraft information.");
        final List<AircraftModel> aircrafts = aviationAcademyProperties.getAircrafts().stream().map(aircraft ->
                new AircraftModel(aircraft.getRegistrationNumber(),aircraft.getType(),aircraft.getModel(),
                        aircraft.getSeats(),aircraft.getEnduranceInHours(),aircraft.getTotalFlightTime(),
                        aircraft.isMultiEngine())).collect(Collectors.toList());

        return aircraftRepository.saveAll(aircrafts);
    }

    @Bean
    public List<?> migrateStudents(AviationAcademyProperties aviationAcademyProperties){
        logger.info("Migrating Student information.");
        final List<StudentModel> students = aviationAcademyProperties.getStudents().stream().map(student ->
                new StudentModel(student.getStudentID(),student.getName(),student.getAge(),student.getTotalFlightHours(),student.getCurrentAircraft()
                )).toList();

        return studentRepository.saveAll(students);
    }

}
