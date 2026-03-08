package com.capg.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
	@Autowired
	BooksService bookService;
	
	//add book
	@PostMapping("/addbook")
	public int addBook(@RequestBody Book books) {
		bookService.addBook(books);
		return books.getBookid();
	}
	
	//retrieve all books
	@GetMapping("/allbooks")
	public List<Book> getAllBooks(){
		return bookService.getAllBooks();
	}
}
