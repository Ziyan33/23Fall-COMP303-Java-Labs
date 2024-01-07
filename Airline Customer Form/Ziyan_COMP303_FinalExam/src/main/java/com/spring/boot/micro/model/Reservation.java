package com.spring.boot.micro.model;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Reservation {
    
    @Id
    private String id;
    @DBRef
    private Passenger passenger;
    @DBRef
    private FlightDetails flightDetails;

    // Constructors, Getters, and Setters...

    public Reservation() {
    }

    public Reservation(Passenger passenger, FlightDetails flightDetails) {
        this.passenger = passenger;
        this.flightDetails = flightDetails;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Passenger getPassenger() {
		return passenger;
	}

	public void setPassenger(Passenger passenger) {
		this.passenger = passenger;
	}

	public FlightDetails getFlightDetails() {
		return flightDetails;
	}

	public void setFlightDetails(FlightDetails flightDetails) {
		this.flightDetails = flightDetails;
	}

    // Standard getters and setters
    
}
