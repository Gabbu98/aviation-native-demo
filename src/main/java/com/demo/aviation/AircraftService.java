package com.demo.aviation;

import com.demo.aviation.models.Aircraft;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AircraftService {

    @Autowired
    ObjectMapper objectMapper;

    public Aircraft createAircraft(){
        String json = "{ \"registrationNumber\" : \"9hian\", \"type\" : \"sira\" , \"model\" : \"sira\" }";

        Aircraft car = null;
        try {
            System.out.println(objectMapper);
            car = objectMapper.readValue(json, Aircraft.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
        return car;
    }
}
