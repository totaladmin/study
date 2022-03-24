package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
public class Start {
	
	@RequestMapping("/helloWorld")
	public String helloWorld() {
		
		return "helloWorld";
		
	}
	public static void main(String[] args) {
		SpringApplication.run(Start.class, args);
		
	}

}
