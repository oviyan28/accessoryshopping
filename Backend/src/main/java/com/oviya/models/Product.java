package com.oviya.models;

import java.beans.Transient;
import java.util.Locale.Category;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Min;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Product {
	@Id       //UNIQUE AND  NOT NULL
	@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
@NotEmpty(message="productName is mandatory")private String productName;
@NotEmpty(message="Productdesc is required")private String productDesc;
@Min(value=0,message="Minimum Quantity must be 0")
private int quantity;
@Min(value=1,message="Minimum price must be one ")private double price;
//@ManyToOne
private Category category;

public Category getCategory() {
	return category;
}
public void setCategory(Category category) {
	this.category = category;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getProductName() {
	return productName;
}
public void setProductName(String productName) {
	this.productName = productName;
}
public String getProductDesc() {
	return productDesc;
}
public void setProductDesc(String productDesc) {
	this.productDesc = productDesc;
}
public int getQuantity() {
	return quantity;
}
public void setQuantity(int quantity) {
	this.quantity = quantity;
}
public double getPrice() {
	return price;
}
public void setPrice(double price) {
	this.price = price;
}


}
