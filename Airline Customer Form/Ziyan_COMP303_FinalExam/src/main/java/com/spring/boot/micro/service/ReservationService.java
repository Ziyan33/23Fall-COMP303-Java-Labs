package com.spring.boot.micro.service;

 
import com.spring.boot.micro.model.Reservation;
import com.spring.boot.micro.repository.FlightDetailsRepository;
import com.spring.boot.micro.repository.PassengerRepository;
import com.spring.boot.micro.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
 
@Service
public class ReservationService {


    // Assume you also have repositories for Passenger and FlightDetails
    private final ReservationRepository reservationRepository;
    private final PassengerRepository passengerRepository; // Add this
    private final FlightDetailsRepository flightDetailsRepository; // And this

    @Autowired
    public ReservationService(ReservationRepository reservationRepository, 
                              PassengerRepository passengerRepository, 
                              FlightDetailsRepository flightDetailsRepository) {
        this.reservationRepository = reservationRepository;
        this.passengerRepository = passengerRepository;
        this.flightDetailsRepository = flightDetailsRepository;
    }

    // Find all reservations for the results page
    public List<Reservation> findAllReservations() {
        return reservationRepository.findAll();
    }

    // Create a new reservation from the form
    // Modified method to save a reservation
    public Reservation createReservation(Reservation reservation) {
        // First, save Passenger and FlightDetails to ensure they have IDs
        if (reservation.getPassenger() != null) {
            passengerRepository.save(reservation.getPassenger());
        }
        if (reservation.getFlightDetails() != null) {
            flightDetailsRepository.save(reservation.getFlightDetails());
        }

        // Now, save the Reservation
        return reservationRepository.save(reservation);
    }

    // Optionally, if you need to find a single reservation by ID after the redirect
    public Optional<Reservation> findReservationById(String id) {
        return reservationRepository.findById(id);
    }

    // Other methods as needed...
}
