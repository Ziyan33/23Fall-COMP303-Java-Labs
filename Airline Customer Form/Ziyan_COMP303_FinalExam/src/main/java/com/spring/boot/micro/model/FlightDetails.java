package com.spring.boot.micro.model;

 
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class FlightDetails {
    
    @Id
    private String id;
    private String departureTime;
    private String departureDate;

    // Constructors, Getters, and Setters...

    public FlightDetails() {
    }

    public FlightDetails(String departureTime, String departureDate) {
        this.departureTime = departureTime;
        this.departureDate = departureDate;
    }

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(String departureTime) {
		this.departureTime = departureTime;
	}

	public String getDepartureDate() {
		return departureDate;
	}

	public void setDepartureDate(String departureDate) {
		this.departureDate = departureDate;
	}

    // Standard getters and setters
    
}