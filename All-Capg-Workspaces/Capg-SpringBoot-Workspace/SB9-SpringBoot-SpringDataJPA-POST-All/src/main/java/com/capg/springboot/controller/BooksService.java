package com.capg.springboot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BooksService {
	@Autowired
	BooksRepository booksRepository;
	
	public void addBook(Book books) {
		booksRepository.save(books);
	}
	
	//get all books from database through SpringDataJPA
	public List<Book> getAllBooks(){
		List<Book> books = new ArrayList<Book>();
		booksRepository.findAll().forEach(b1 -> books.add(b1));
		System.out.println(books);
		return books;
	}
}
