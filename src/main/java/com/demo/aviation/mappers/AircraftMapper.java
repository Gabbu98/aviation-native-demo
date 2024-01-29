package com.demo.aviation.mappers;

import com.demo.aviation.controllers.responses.AircraftResponse;
import com.demo.aviation.persistence.models.AircraftModel;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AircraftMapper {

    AircraftResponse mapAircraftModelToAircraftResponse(AircraftModel aircraftModel);
}
