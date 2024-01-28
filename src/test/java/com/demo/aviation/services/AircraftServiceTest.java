package com.demo.aviation.services;

import com.demo.aviation.configurations.properties.AviationAcademyProperties;
import com.demo.aviation.persistence.models.AircraftModel;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import uk.co.jemos.podam.api.PodamFactory;
import uk.co.jemos.podam.api.PodamFactoryImpl;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@SpringBootTest
public class AircraftServiceTest {
    private final Logger logger = LoggerFactory.getLogger(AircraftServiceTest.class);

    @Autowired
    private AviationAcademyProperties aviationAcademyProperties;

    @Autowired
    private AircraftService aircraftService;

    @Test
    void fetchAircrafts_success(){
        List<AircraftModel> result = aircraftService.fetchAircrafts();

        logger.info("Asserting results.");
        assertThat(result.size()).isEqualTo(aviationAcademyProperties.getAircrafts().size());
        for(int i = 0 ; i< result.size(); i++){
            assertThat(result.get(i).getRegistrationNumber()).isEqualTo(aviationAcademyProperties.getAircrafts().get(i).getRegistrationNumber());
        }
    }
}
