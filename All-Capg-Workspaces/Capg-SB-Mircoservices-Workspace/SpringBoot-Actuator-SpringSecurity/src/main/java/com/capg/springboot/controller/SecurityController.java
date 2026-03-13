package com.capg.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/actuator")
public class SecurityController {
	@GetMapping("/hello")
	public String myAdd() {
		return "Hello SpringBoot Actuator Security";
	}
}
