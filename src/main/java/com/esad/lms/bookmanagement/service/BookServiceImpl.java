package com.esad.lms.bookmanagement.service;

import java.util.List;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.esad.lms.bookmanagement.model.Books;
import com.esad.lms.bookmanagement.repository.BookRepository;

@Component
public class BookServiceImpl implements BookService {
	private final Logger logger = LoggerFactory.getLogger(BookServiceImpl.class);

	@Resource
	BookRepository bookRepository;

	@Override
	public List<Books> findAll() {
		logger.info("Invoking get book list service");
		return bookRepository.findAll();
	}

	@Override
	public Books getBook(Books book) {
		logger.info("Invoking get book service");
		return bookRepository.getBook(book);

	}

	@Override
	public void insertBook(Books book) {
		logger.info("Invoking insert book service");
		bookRepository.insertBook(book);

	}

	@Override
	public void updateBook(Books book) {
		logger.info("Invoking update book service");
		bookRepository.updateBook(book);

	}

	@Override
	public void executeUpdateBook(Books book) {
		logger.info("Invoking executeUpdateBook service");
		bookRepository.executeUpdateBook(book);

	}

	@Override
	public void deleteBook(Books book) {
		logger.info("Invoking delete book service");
		bookRepository.deleteBook(book);

	}

}
