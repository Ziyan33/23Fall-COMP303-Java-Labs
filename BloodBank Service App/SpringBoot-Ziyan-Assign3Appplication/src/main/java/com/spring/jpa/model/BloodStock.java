package com.spring.jpa.model;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "BloodStock")
public class BloodStock {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String bloodGroup;
    private Integer quantity;
    private Date bestBefore; // Use java.util.Date or java.time.LocalDate
    private String status;
	
	
	public String getBloodGroup() {
		return bloodGroup;
	}


	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Date getBestBefore() {
		return bestBefore;
	}


	public void setBestBefore(Date bestBefore) {
		this.bestBefore = bestBefore;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		
		 this.id = id;
	}

}
