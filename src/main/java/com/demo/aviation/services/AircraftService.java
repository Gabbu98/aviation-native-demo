package com.demo.aviation.services;

import com.demo.aviation.configurations.Config;
import com.demo.aviation.persistence.models.AircraftModel;
import com.demo.aviation.persistence.repositories.AircraftRepository;
import com.demo.aviation.records.AircraftRecord;
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

    public List<AircraftModel> fetchAircrafts() {
        logger.info("Fetching a list of aircrafts.");
        return aircraftRepository.findAll();
    }

    public AircraftModel createAircraft(final AircraftRecord aircraftRecord) {
        final AircraftModel aircraftModel = new AircraftModel(aircraftRecord.registrationNumber(), aircraftRecord.type(),
                aircraftRecord.model(), aircraftRecord.seats(), aircraftRecord.enduranceInHours(),
                aircraftRecord.totalFlightTime(), aircraftRecord.multiEngine());

        logger.info("Registering aircraft [{}].", aircraftRecord.registrationNumber());
        return aircraftRepository.insert(aircraftModel);
    }
}
