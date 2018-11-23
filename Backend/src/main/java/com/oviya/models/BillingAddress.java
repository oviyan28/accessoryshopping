package com.oviya.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BillingAddress {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int BillingId;
private String AppartmentNumber;
private String StreetName;
private String City;
private String State;
private String Country;
private String ZipCode;
public int getBillingId() {
	return BillingId;
}
public void setBillingId(int billingId) {
	BillingId = billingId;
}
public String getAppartmentNumber() {
	return AppartmentNumber;
}
public void setAppartmentNumber(String appartmentNumber) {
	AppartmentNumber = appartmentNumber;
}
public String getStreetName() {
	return StreetName;
}
public void setStreetName(String streetName) {
	StreetName = streetName;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
public String getState() {
	return State;
}
public void setState(String state) {
	State = state;
}
public String getCountry() {
	return Country;
}
public void setCountry(String country) {
	Country = country;
}
public String getZipCode() {
	return ZipCode;
}
public void setZipCode(String zipCode) {
	ZipCode = zipCode;
}


}
