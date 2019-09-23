package com.hms.helloworldSB.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping
	public String hello() {
		System.out.println("I AM IN CONTROLLER AND I LIKE IT");
		return "Hello World";
	}
}
