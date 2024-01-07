package com.spring.jpa.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "BloodBank")
public class BloodBank {

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;

	    private String bloodbankName;
	    private String address;
	    private String city;
	    private String phone;
	    private String website;
	    private String email;
	    
	    
	    
		public String getBloodbankName() {
			return bloodbankName;
		}



		public void setBloodbankName(String bloodbankName) {
			this.bloodbankName = bloodbankName;
		}



		public String getAddress() {
			return address;
		}



		public void setAddress(String address) {
			this.address = address;
		}



		public String getCity() {
			return city;
		}



		public void setCity(String city) {
			this.city = city;
		}



		public String getPhone() {
			return phone;
		}



		public void setPhone(String phone) {
			this.phone = phone;
		}



		public String getWebsite() {
			return website;
		}



		public void setWebsite(String website) {
			this.website = website;
		}



		public String getEmail() {
			return email;
		}



		public void setEmail(String email) {
			this.email = email;
		}



		public Integer getId() {
			return id;
		}



		public void setId(Integer id2) {
			 this.id = id2;
		}

}
