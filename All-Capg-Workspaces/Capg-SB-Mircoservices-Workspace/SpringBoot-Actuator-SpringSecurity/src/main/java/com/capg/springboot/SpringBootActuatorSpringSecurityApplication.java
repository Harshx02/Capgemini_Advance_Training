package com.capg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootActuatorSpringSecurityApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootActuatorSpringSecurityApplication.class, args);
		System.out.println("Actuator is starting...");
	}

}
