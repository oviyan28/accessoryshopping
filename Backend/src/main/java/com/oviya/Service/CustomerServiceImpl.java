package com.oviya.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.oviya.Dao.CustomerDao;
import com.oviya.models.Customer;
@Service
public class CustomerServiceImpl implements CustomerService {



    @Autowired
	private CustomerDao customerDao;
		

	public boolean isEmailUnique(String email) {
		return customerDao.isEMailUnique(email);
	}
	public void registerCustomer(Customer customer) {
		customerDao.RegisterCustomer(customer);

		// TODO Auto-generated method stub
		
	}

}

