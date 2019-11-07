package com.esad.lms.bookmanagement.repository;

import java.util.List;

import com.esad.lms.bookmanagement.model.Books;

public interface BookRepository {

	List<Books> findAll();

	Books getBook(Books book);

	void insertBook(Books book);

	void updateBook(Books book);

	void executeUpdateBook(Books book);

	void deleteBook(Books book);

}
