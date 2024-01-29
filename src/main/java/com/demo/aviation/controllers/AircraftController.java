package com.demo.aviation.controllers;

import com.demo.aviation.controllers.responses.AircraftResponse;
import com.demo.aviation.mappers.AircraftMapper;
import com.demo.aviation.services.AircraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("aircrafts")
public class AircraftController {

    @Autowired
    private AircraftService aircraftService;

    @Autowired
    private AircraftMapper aircraftMapper;

    @GetMapping(produces = "application/json")
    public ResponseEntity<List<AircraftResponse>> getAircrafts(){

        final List<AircraftResponse> aircraftResponses = this.aircraftService.fetchAircrafts().stream().map(aircraftModel -> aircraftMapper.mapAircraftModelToAircraftResponse(aircraftModel)).collect(Collectors.toList());

        return ResponseEntity.ok(aircraftResponses);
    }
}
