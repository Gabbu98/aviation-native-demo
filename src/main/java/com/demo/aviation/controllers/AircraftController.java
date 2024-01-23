package com.demo.aviation.controllers;

import java.util.List;

import com.demo.aviation.services.AircraftService;
import com.demo.aviation.configurations.properties.Aircraft;

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

    @GetMapping
    public ResponseEntity<List<Aircraft>> getAircrafts(){
        return ResponseEntity.ok(aircraftService.fetchAircrafts());
    }
}
