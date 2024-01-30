package com.demo.aviation.controllers;

import com.demo.aviation.controllers.requests.AircraftRequest;
import com.demo.aviation.controllers.responses.AircraftResponse;
import com.demo.aviation.mappers.AircraftMapper;
import com.demo.aviation.services.AircraftService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class AircraftController {

    @Autowired
    private AircraftService aircraftService;

    @Autowired
    private AircraftMapper aircraftMapper;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE, value = "/aircrafts")
    public ResponseEntity<List<AircraftResponse>> getAircrafts(){

        final List<AircraftResponse> aircraftResponses = this.aircraftService.fetchAircrafts().stream().map(aircraftModel ->
                aircraftMapper.mapAircraftModelToAircraftResponse(aircraftModel)).collect(Collectors.toList());
        return new ResponseEntity<>(aircraftResponses, HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE, value = "/aircrafts/register")
    public ResponseEntity<AircraftResponse> registerAircraft(@RequestBody AircraftRequest aircraftRequest){
        return new ResponseEntity<>(aircraftMapper.mapAircraftModelToAircraftResponse(this.aircraftService
                .createAircraft(aircraftMapper.mapAircraftRequestToAircraftRecord(aircraftRequest))),HttpStatus.CREATED);
    }
}
