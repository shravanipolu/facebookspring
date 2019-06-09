package com.pojos;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public class Address {
private String houseNumber;
private String streetName;
private String city;

public String getHouseNumber() {
	return houseNumber;
}
public void setHouseNumber(String houseNumber) {
	this.houseNumber = houseNumber;
}
public String getStreetName() {
	return streetName;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}


}
