package com.demo.aviation.mappers;

import com.demo.aviation.controllers.requests.AircraftRequest;
import com.demo.aviation.controllers.responses.AircraftResponse;
import com.demo.aviation.persistence.models.AircraftModel;
import com.demo.aviation.records.AircraftRecord;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface AircraftMapper {

    AircraftResponse mapAircraftModelToAircraftResponse(AircraftModel aircraftModel);

    AircraftRecord mapAircraftRequestToAircraftRecord(AircraftRequest aircraftModel);
}
