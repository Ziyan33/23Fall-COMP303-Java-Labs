package com.vinay.spring.mvc;
 
 
public class User {
    private String firstName;
    private String lastName;
    private String email;
    private String address1;
    private String address2;
    private String inputCity;
    private String state;
    private String inputZip;
    private String areaCode;
    private String phoneNum;
    
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
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
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getAddress1() {
		return address1;
	}
	public void setAddress1(String address1) {
		this.address1 = address1;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getInputCity() {
		return inputCity;
	}
	public void setInputCity(String inputCity) {
		this.inputCity = inputCity;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getInputZip() {
		return inputZip;
	}
	public void setInputZip(String inputZip) {
		this.inputZip = inputZip;
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", address1=" + address1
				+ ", address2=" + address2 + ", inputCity=" + inputCity + ", state=" + state + ", inputZip=" + inputZip
				+ ", areaCode=" + areaCode + ", phoneNum=" + phoneNum + "]";
	}
	
 
}