package com.enrollee.repository;

import com.enrollee.model.Dependent;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DependentsRepository extends MongoRepository<Dependent, Integer> {
}
