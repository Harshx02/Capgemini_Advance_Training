package com.capg.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capg.springboot.dto.Book;

@RestController
@RequestMapping("/category")
public class CategoryController {
	@RequestMapping("/list")
	public Book getAllData() {
		return new Book(1001,"How to influence friends and people");
	}
}
