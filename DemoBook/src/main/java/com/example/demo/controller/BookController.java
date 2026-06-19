package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Book;
import com.example.demo.service.BookService;

@RestController
public class BookController {

	@Autowired
	private BookService bs;
	
	@GetMapping("display")
	public List<Book> displayBooks() {
		return bs.display();
	}
	
	@PostMapping("add")
	public void addBook(Book b) {
		bs.add(b);
	}
}
