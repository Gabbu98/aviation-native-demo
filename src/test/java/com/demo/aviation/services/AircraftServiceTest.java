package com.demo.aviation.services;

import com.demo.aviation.persistence.models.AircraftModel;
import org.junit.jupiter.api.Test;
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
    private final PodamFactory factory = new PodamFactoryImpl();

//    @MockBean
//    private AircraftRepository aircraftRepository;

    @Autowired
    private AircraftService aircraftService;

    @Test
    void fetchAircrafts_success(){
        List<AircraftModel> aircraftModels = factory.manufacturePojo(List.class,AircraftModel.class);

//        when(this.aircraftRepository.findAll()).thenReturn(aircraftModels);
        List<AircraftModel> result = aircraftService.fetchAircrafts();

        assertThat(result.size()).isNotNull();
//        verify(aircraftRepository).findAll();
    }
}
