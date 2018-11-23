package com.oviya.Dao;

import com.oviya.models.Customer;

public interface CustomerDao {
void RegisterCustomer(Customer customer);
boolean isEMailUnique(String EMail);

}
