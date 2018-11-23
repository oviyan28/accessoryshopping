package com.oviya.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
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
	@RequestMapping("/login")
	public String login() {
		return "login";
	}
	@RequestMapping("/loginerror")
	public String loginError(Model model){
		model.addAttribute("loginError","Invalid email/password");
		return "login";
	}
	@RequestMapping(value="/logout")
	public String logout(Model model){
		model.addAttribute("message","Loggedout successfully..");
		return "login";
	}

}

