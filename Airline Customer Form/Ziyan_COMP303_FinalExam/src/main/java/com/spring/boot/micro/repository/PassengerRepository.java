package com.spring.boot.micro.repository;

import com.spring.boot.micro.model.Passenger;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PassengerRepository extends MongoRepository<Passenger, String> {
    // Custom queries for Passenger can be added here
}
