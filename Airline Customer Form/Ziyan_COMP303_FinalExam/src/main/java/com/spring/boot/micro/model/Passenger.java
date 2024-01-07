package com.spring.boot.micro.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Passenger {
    
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private int numberOfPassengers; // assuming this is a count of passengers including this one
    
    // Constructors, Getters, and Setters...

    public Passenger() {
    }

    public Passenger(String firstName, String lastName, int numberOfPassengers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.numberOfPassengers = numberOfPassengers;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

    // Standard getters and setters
    
}