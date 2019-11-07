package com.esad.lms.bookmanagement.controller;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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
	private final Logger logger= LoggerFactory.getLogger(BookController.class);
	
	@Resource 
	BookService bookService;
	
	@GetMapping(value = "/bookList")
	public List<Books> getBooks() {
		logger.info("Invoking get book list flow");
		return bookService.findAll();
	
	}
	
	@PostMapping(value = "/book")
	public void getBook(@RequestBody Books book) {
		logger.info("Invoking get book list flow");
		bookService.getBook(book);
	
	}
	
	@PostMapping(value = "/insertBook")
	public void createBook(@RequestBody Books book) {
		logger.info("Invoking insert book flow");
		bookService.insertBook(book);
	
	}
	@PutMapping(value = "/updateBook")
	public void updateBook(@RequestBody Books book) {
		logger.info("Invoking update book flow");
		bookService.updateBook(book);
	
	}
	@PutMapping(value = "/executeUpdateBook")
	public void executeUpdateBook(@RequestBody Books book) {
		logger.info("Invoking executeUpdateBook book flow");
		bookService.executeUpdateBook(book);
	
	}
	
	@DeleteMapping(value = "/deleteBook")
	public void deleteBook(@RequestBody Books book) {
		logger.info("Invoking delete book flow");
		bookService.deleteBook(book);
	
	}

}
