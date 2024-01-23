package com.demo.aviation.configurations;

import java.io.FileWriter;
import java.io.IOException;

import com.demo.aviation.configurations.properties.AviationAcademyProperties;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    @Bean
    ObjectMapper objectMapper(AviationAcademyProperties aviationAcademyProperties){

        ObjectMapper om = new ObjectMapper();
        om.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);

        Gson gson = new Gson();
        try {
            gson.toJson(aviationAcademyProperties, new FileWriter("src/main/resources/data2.json"));

            return om;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Bean
    AviationAcademyProperties aviationAcademyProperties(){
        return new AviationAcademyProperties();
    }

}
