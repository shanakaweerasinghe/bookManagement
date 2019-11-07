package com.esad.lms.bookmanagement.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.esad.lms.bookmanagement.model.Books;

public class BooksRowMapper implements RowMapper<Books> {
	@Override
	public Books mapRow(ResultSet rs, int arg1) throws SQLException {
		Books books = new Books();
		books.setBookId(rs.getString("bookId"));
		books.setBookName(rs.getString("bookName"));
		books.setAuthor(rs.getString("author"));
		books.setEdition(rs.getString("edition"));
		books.setCategory(rs.getString("category"));
		books.setLibraryId(rs.getString("libraryId"));
		books.setRackNo(rs.getString("rackNo"));
		books.setStatus(rs.getString("status"));
		books.setIssuedTo(rs.getString("issuedTo"));
		books.setDateOfIssued(rs.getString("dateOfIssued"));
		books.setDateOfPurchase(rs.getString("dateOfPurchase"));
		books.setPrice(rs.getString("price"));
		books.setDescription(rs.getString("description"));

		return books;
	}

}
