package com.demo.aviation.services;

import com.demo.aviation.configurations.Config;
import com.demo.aviation.persistence.models.AircraftModel;
import com.demo.aviation.persistence.repositories.AircraftRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AircraftService {
    private final Logger logger = LoggerFactory.getLogger(AircraftService.class);

    private AircraftRepository aircraftRepository;

    public AircraftService(AircraftRepository aircraftRepository) {
        this.aircraftRepository = aircraftRepository;
    }

    public List<AircraftModel> fetchAircrafts(){
        logger.info("Fetching a list of aircrafts.");
        return aircraftRepository.findAll();
    }
}
