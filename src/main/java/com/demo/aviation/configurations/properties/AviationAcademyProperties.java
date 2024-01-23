package com.demo.aviation.configurations.properties;

import java.util.List;
import java.util.Objects;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "data")
public class AviationAcademyProperties {

    private List<Aircraft> aircrafts;
    private List<Student> students;

    public AviationAcademyProperties() {
    }

    public AviationAcademyProperties(List<Aircraft> aircrafts, List<Student> students) {
        this.aircrafts = aircrafts;
        this.students = students;
    }

    public List<Aircraft> getAircrafts() {
        return aircrafts;
    }

    public AviationAcademyProperties setAircrafts(List<Aircraft> aircrafts) {
        this.aircrafts = aircrafts;
        return this;
    }

    public List<Student> getStudents() {
        return students;
    }

    public AviationAcademyProperties setStudents(List<Student> students) {
        this.students = students;
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AviationAcademyProperties that = (AviationAcademyProperties) o;
        return Objects.equals(aircrafts, that.aircrafts) && Objects.equals(students, that.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aircrafts, students);
    }

    @Override
    public String toString() {
        return "AviationAcademyProperties{" +
                "aircrafts=" + aircrafts +
                ", students=" + students +
                '}';
    }
}
