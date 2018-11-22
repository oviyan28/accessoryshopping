package com.oviya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oviya.Dao.CustomerDao;
import com.oviya.models.Customer;

@Controller
public class CustomerController {
@Autowired
private CustomerDao customerDao;
@RequestMapping(value="/all/getRegisterForm")
public String getRegisterForm(Model model) {
	Customer customer=new Customer();
	model.addAttribute("Customer",customer);
	return "RegisterForm";
	
}
@RequestMapping(value="/all/RegisterCustomer")
public String RegisterCustomer(@ModelAttribute Customer customer,Model model) {
String EMail=customer.getUser().getEMail();
if(!customerDao.isEMailUnique(EMail)){//Email is duplicate, Not Unique
	model.addAttribute("errorMessage","Email already exists.. please choose different email id");
	return "RegisterForm";

}
customerDao.RegisterCustomer(customer);
return "Sign up";

	
}
}

