package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@DeleteMapping("delete/{id}")
	public void deleteBook(@PathVariable("id") int bookId) {
		bs.delete(bookId);
	}
	
	@PutMapping("update/{existingId}")
	public Book updateBook(@PathVariable("existingId") int bookID, @RequestBody Book b) {
		return bs.update(bookID, b);
	}
	
	@PostMapping("addAll")
	public void addAllBook(@RequestBody List<Book> b) {
		bs.addAll(b);
	}
}
