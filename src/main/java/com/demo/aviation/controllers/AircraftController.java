package com.demo.aviation.controllers;

import com.demo.aviation.AircraftService;
import com.demo.aviation.models.Aircraft;
import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
@RequestMapping("aircrafts")
public class AircraftController {

    @Autowired
    AircraftService aircraftService;

    @GetMapping("/one")
    public ResponseEntity<Aircraft> getAircraft(){
        Aircraft aircraft = null;

        aircraft = aircraftService.createAircraft();

        return ResponseEntity.ok(aircraft);
    }
}
