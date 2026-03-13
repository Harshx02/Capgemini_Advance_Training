package com.capg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootActuatorNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActuatorNewApplication.class, args);
		System.out.println("Actuator is working now.");
	}

}
