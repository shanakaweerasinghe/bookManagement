package com.esad.lms.bookmanagement.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.esad.lms.bookmanagement.model.Books;
import com.esad.lms.bookmanagement.repository.BookRepository;

@Component
public class BookServiceImpl implements BookService {
	
	@Resource
	BookRepository bookRepository;

	@Override
	public List<Books> findAll() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Books getBook(Books book) {
		// TODO Auto-generated method stub
		return bookRepository.getBook(book);

	}

	@Override
	public void insertBook(Books book) {
		// TODO Auto-generated method stub
		bookRepository.insertBook(book);

	}

	@Override
	public void updateBook(Books book) {
		// TODO Auto-generated method stub
		bookRepository.updateBook(book);

	}

	@Override
	public void executeUpdateBook(Books book) {
		// TODO Auto-generated method stub
		bookRepository.executeUpdateBook(book);

	}

	@Override
	public void deleteBook(Books book) {
		// TODO Auto-generated method stub
		bookRepository.deleteBook(book);

	}

}
