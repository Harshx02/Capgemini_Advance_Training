package com.capg.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class B03BookInformationApplication {

	public static void main(String[] args) {
		SpringApplication.run(B03BookInformationApplication.class, args);
		System.out.println("SpringBoot... Book Information started.");
	}
	
	@Bean
	RestTemplate template() {
		return new RestTemplate();
	}
}
