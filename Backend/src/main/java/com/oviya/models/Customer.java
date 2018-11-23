package com.oviya.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Customer {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
private int customerId;
private String FirstName;
private String LastName;
private String PhoneNumber;
@OneToOne(cascade=CascadeType.ALL)
private User user;
@OneToOne(cascade=CascadeType.ALL)
private ShippingAddress shippingaddress;
@OneToOne(cascade=CascadeType.ALL)
private BillingAddress billingaddress;
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}
public String getFirstName() {
	return FirstName;
}
public void setFirstName(String firstName) {
	FirstName = firstName;
}
public String getLastName() {
	return LastName;
}
public void setLastName(String lastName) {
	LastName = lastName;
}
public String getPhoneNumber() {
	return PhoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	PhoneNumber = phoneNumber;
}
public User getUser() {
	return user;
}
public void setUser(User user) {
	this.user = user;
}
public ShippingAddress getShippingaddress() {
	return shippingaddress;
}
public void setShippingaddress(ShippingAddress shippingaddress) {
	this.shippingaddress = shippingaddress;
}
public BillingAddress getBillingaddress() {
	return billingaddress;
}
public void setBillingaddress(BillingAddress billingaddress) {
	this.billingaddress = billingaddress;
}


}
