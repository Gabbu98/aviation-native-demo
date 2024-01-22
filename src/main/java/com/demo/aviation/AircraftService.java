package com.demo.aviation;

import com.demo.aviation.models.Aircraft;

import org.springframework.stereotype.Service;

@Service
public class AircraftService {

    public Aircraft createAircraft(){
        String json = "{ \"registrationNumber\" : \"9hian\", \"type\" : \"sira\" , \"model\" : \"sira\" }";
        Aircraft car = new Aircraft("sss","ss","ss");
        return car;
    }
}
