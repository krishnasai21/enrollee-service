package com.enrollee.repository;

import com.enrollee.model.Enrollee;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnrolleeRepository extends MongoRepository<Enrollee, String> {

}
