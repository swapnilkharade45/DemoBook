package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Book;

public interface BookService {

	void add(Book b);
	
	List<Book> display();
	
	void delete(int bookId);

	Book update(int bookId, Book b);
	
	void addAll(List<Book> b);
}
