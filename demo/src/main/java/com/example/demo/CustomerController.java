package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CustomerController {
	
	@Autowired
	CustomerService customerService1;
	@Autowired
	CustomerService customerService2;
	
	
	@GetMapping("/getDetails")
	public String showDetails() {
		
		customerService1.setMessage("Message is set");
		
		System.out.println("Message by customerService1 "+customerService1.getMessage());
		
		System.out.println("Message by customerService2  "+customerService2.getMessage());
		
		return "Display Data";
	}

}
