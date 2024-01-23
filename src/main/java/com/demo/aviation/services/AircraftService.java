package com.demo.aviation.services;

import java.util.List;

import com.demo.aviation.configurations.properties.Aircraft;

import com.demo.aviation.configurations.properties.AviationAcademyProperties;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AircraftService {

    @Autowired
    AviationAcademyProperties aviationAcademyProperties;

    @Autowired
    ObjectMapper objectMapper;

    public List<Aircraft> fetchAircrafts(){
        return aviationAcademyProperties.getAircrafts();
    }
}
