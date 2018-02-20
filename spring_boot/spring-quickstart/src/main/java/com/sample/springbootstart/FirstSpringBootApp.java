package com.sample.springbootstart;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Tells spring boot these is the starting point of the application
@SpringBootApplication
public class FirstSpringBootApp {

	public static void main(String args[]) {
		SpringApplication.run(FirstSpringBootApp.class, args);
	}

}
