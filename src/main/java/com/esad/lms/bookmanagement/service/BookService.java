package com.esad.lms.bookmanagement.service;

import java.util.List;

import com.esad.lms.bookmanagement.model.Books;

public interface BookService {
	List<Books> findAll();

	Books getBook(Books book);

	void insertBook(Books book);

	void updateBook(Books book);

	void executeUpdateBook(Books book);

	void deleteBook(Books book);

}
