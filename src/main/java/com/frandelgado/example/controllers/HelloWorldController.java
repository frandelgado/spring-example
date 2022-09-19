package com.frandelgado.example.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

	private static final Logger LOG = LoggerFactory.getLogger(HelloWorldController.class);

	@GetMapping("/")
	public String index() {
		return "Greetings from Spring Boot!";
	}

	@GetMapping("/greetings/{username}")
	public String getGreetings(@PathVariable("username") String userName) {
		return "Hello " + userName + ", Good day...!!!";
	}
}
