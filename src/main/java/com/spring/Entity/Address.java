package com.spring.Entity;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
	
	
	
	//private int id;
	private String city;
	private String State;
	private String zipcode;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getZipcode() {
		return zipcode;
	}
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", State=" + State + ", zipcode=" + zipcode + "]";
	}
	public Address(String city, String state, String zipcode) {
		super();
		this.city = city;
		State = state;
		this.zipcode = zipcode;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
