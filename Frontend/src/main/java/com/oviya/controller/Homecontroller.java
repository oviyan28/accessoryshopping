package com.oviya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
	public Homecontroller() {
	System.out.println("Homecontroller bean is created");
		}
@RequestMapping(value="/home")
public String getHomePage() {
	return "home";
	
}
}
