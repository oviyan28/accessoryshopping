package com.oviya.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class User {
@Id
private String EMail;
private String Password;
private String Enabled;
@OneToOne(mappedBy="user",cascade=CascadeType.ALL)
private Authorities authorities;
@OneToOne(mappedBy="user")
private Customer customer;
public String getEMail() {
	return EMail;
}
public void setEMail(String eMail) {
	EMail = eMail;
}
public String getPassword() {
	return Password;
}
public void setPassword(String password) {
	Password = password;
}
public String getEnabled() {
	return Enabled;
}
public void setEnabled(String enabled) {
	Enabled = enabled;
}
public Authorities getAuthorities() {
	return authorities;
}
public void setAuthorities(Authorities authorities) {
	this.authorities = authorities;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}

}
