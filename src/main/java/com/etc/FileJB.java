package com.etc;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class FileJB {
	
	private String airport_code;
	private String airport_name;
	private String city;
	private String state;
	private String countrycode;
	@Id
	private String latitude;
	private String longitude;
	
	
	
	
	
	public FileJB(String airport_code, String airport_name, String city, String state, String countrycode,
			String latitude, String longitude) {
		super();
		this.airport_code = airport_code;
		this.airport_name = airport_name;
		this.city = city;
		this.state = state;
		this.countrycode = countrycode;
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	
	public FileJB() {
		
	}
	
	public String getAirport_code() {
		return airport_code;
	}
	public void setAirport_code(String airport_code) {
		this.airport_code = airport_code;
	}
	public String getAirport_name() {
		return airport_name;
	}
	public void setAirport_name(String airport_name) {
		this.airport_name = airport_name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	
	
	
}
