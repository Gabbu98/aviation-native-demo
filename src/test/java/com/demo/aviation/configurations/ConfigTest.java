package com.demo.aviation.configurations;

import com.demo.aviation.persistence.repositories.AircraftRepository;
import com.demo.aviation.persistence.repositories.StudentRepository;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ConfigTest {

    @Mock
    AircraftRepository aircraftRepository;

    @Mock
    StudentRepository studentRepository;

    @InjectMocks
    Config config;

    @Test
    void migrateAircraft(){
//        migrateAircraft();
    }
}
