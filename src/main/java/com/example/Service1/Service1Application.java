package com.example.Service1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Service1Application {

	public static void main(String[] args) {
		SpringApplication.run(Service1Application.class, args);
	}
	@GetMapping("/test1") 
	public String test1() {
		return "test1 method of service1";
	}
	@GetMapping("/test2")
	public String test2() {
		return "test1 method of service1";
	}

}