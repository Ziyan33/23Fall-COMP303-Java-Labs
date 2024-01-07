package com.spring.boot.micro.repository;

 
import com.spring.boot.micro.model.Reservation;


import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservationRepository extends MongoRepository<Reservation, String> {
    // The basic CRUD operations are already provided by MongoRepository.
    // You can add custom queries if needed, for example:
   }
