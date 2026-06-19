package com.example.demo.service;

import java.util.List;

import com.example.demo.model.Book;

public interface BookService {

	void add(Book b);
	List<Book> display();
}
