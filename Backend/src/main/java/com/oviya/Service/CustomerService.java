package com.oviya.Service;

import com.oviya.models.Customer;

public interface CustomerService {

	void registerCustomer(Customer customer);
    boolean isEmailUnique(String email);
}

