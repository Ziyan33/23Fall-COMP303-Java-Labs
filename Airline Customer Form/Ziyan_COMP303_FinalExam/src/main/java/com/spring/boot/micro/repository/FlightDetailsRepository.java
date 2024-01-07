package com.spring.boot.micro.repository;

import com.spring.boot.micro.model.FlightDetails;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface FlightDetailsRepository extends MongoRepository<FlightDetails, String> {
    // Custom queries for FlightDetails can be added here
}
