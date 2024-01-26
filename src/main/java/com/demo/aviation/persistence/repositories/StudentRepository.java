package com.demo.aviation.persistence.repositories;

import com.demo.aviation.persistence.models.StudentModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<StudentModel, String> {
}
