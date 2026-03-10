package com.capg.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.dto.Book;

@RestController
@RequestMapping("/rating")
public class RatingController {
	@RequestMapping("/list")
	public Book getAllData() {
		return new Book(1001,4);
	}
}
