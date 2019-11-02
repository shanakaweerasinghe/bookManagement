package com.esad.lms.bookmanagement.controller;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esad.lms.bookmanagement.model.Books;
import com.esad.lms.bookmanagement.service.BookService;

@RestController
@RequestMapping("/booksManagement")
public class BookController {
	
	@Resource 
	BookService bookService;
	
	@GetMapping(value = "/bookList")
	public List<Books> getBooks() {
		return bookService.findAll();
	
	}
	
	@GetMapping(value = "/book")
	public void getBook(@RequestBody Books book) {
		bookService.getBook(book);
	
	}
	
	@PostMapping(value = "/insertBook")
	public void createBook(@RequestBody Books book) {
		bookService.insertBook(book);
	
	}
	@PutMapping(value = "/updateBook")
	public void updateBook(@RequestBody Books book) {
		bookService.updateBook(book);
	
	}
	@PutMapping(value = "/executeUpdateBook")
	public void executeUpdateBook(@RequestBody Books book) {
		bookService.executeUpdateBook(book);
	
	}
	
	@DeleteMapping(value = "/deleteBook")
	public void deleteBook(@RequestBody Books book) {
		bookService.deleteBook(book);
	
	}

}
