package com.capg.springboot.dto;

public class Book {
	private int bookId;
	private String bookName;
	private int bookRating;
	
	public Book() {
		
	}
	public Book(int bookId, String bookName, int bookRating) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookRating = bookRating;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookRating() {
		return bookRating;
	}
	public void setBookRating(int bookRating) {
		this.bookRating = bookRating;
	}
	
}
