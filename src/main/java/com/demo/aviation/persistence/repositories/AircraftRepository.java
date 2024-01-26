package com.demo.aviation.persistence.repositories;

import com.demo.aviation.persistence.models.AircraftModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AircraftRepository extends MongoRepository<AircraftModel, String> {
}
