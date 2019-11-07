package com.esad.lms.bookmanagement.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import com.esad.lms.bookmanagement.mapper.BooksRowMapper;
import com.esad.lms.bookmanagement.model.Books;

@Repository
public class BookRepositiryImpl implements BookRepository {
	private final Logger logger = LoggerFactory.getLogger(BookRepositiryImpl.class);

	public BookRepositiryImpl(NamedParameterJdbcTemplate template) {
		this.template = template;
	}

	NamedParameterJdbcTemplate template;

	@Override
	public List<Books> findAll() {
		logger.info("Invoking get book list DAO");
		return template.query("select * from books", new BooksRowMapper());
	}

	@Override
	public Books getBook(Books book) {
		return null;

	}

	@Override
	public void insertBook(Books book) {
		logger.info("Invoking insert book DAO");
		final String sql = "insert into books(bookId,bookName,author,edition,category,libraryId,rackNo,status,issuedTo,dateOfissued,dateOfPurchase,price,description) values(:bookId,:bookName,:author,:edition,:category,:libraryId,:rackNo,:status,:issuedTo,:dateOfissued,:dateOfPurchase,:price,:description)";

		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource().addValue("bookId", book.getBookId())
				.addValue("bookName", book.getBookName()).addValue("author", book.getAuthor())
				.addValue("edition", book.getEdition()).addValue("category", book.getCategory())
				.addValue("libraryId", book.getLibraryId()).addValue("rackNo", book.getRackNo())
				.addValue("status", book.getStatus()).addValue("issuedTo", book.getIssuedTo())
				.addValue("dateOfissued", book.getDateOfIssued()).addValue("dateOfPurchase", book.getDateOfPurchase())
				.addValue("price", book.getPrice()).addValue("description", book.getDescription());
		template.update(sql, param, holder);
	}

	@Override
	public void updateBook(Books book) {
		logger.info("Invoking update book DAO");
		final String sql = "update books set bookId=:bookId,bookName=:bookName,author=:author,edition=:edition,category=:category,libraryId=:libraryId,rackNo=:rackNo,status=:status,issuedTo=:issuedTo,dateOfissued=:dateOfissued,dateOfPurchase=:dateOfPurchase,price=:price,description=:description where bookId=:bookId";
		KeyHolder holder = new GeneratedKeyHolder();
		SqlParameterSource param = new MapSqlParameterSource().addValue("bookId", book.getBookId())
				.addValue("bookName", book.getBookName()).addValue("author", book.getAuthor())
				.addValue("edition", book.getEdition()).addValue("category", book.getCategory())
				.addValue("libraryId", book.getLibraryId()).addValue("rackNo", book.getRackNo())
				.addValue("status", book.getStatus()).addValue("issuedTo", book.getIssuedTo())
				.addValue("dateOfissued", book.getDateOfIssued()).addValue("dateOfPurchase", book.getDateOfPurchase())
				.addValue("price", book.getPrice()).addValue("description", book.getDescription());
		template.update(sql, param, holder);
	}

	@Override
	public void executeUpdateBook(Books book) {
		logger.info("Invoking executeUpdateBook DAO");
		final String sql = "update books set bookId=:bookId,bookName=:bookName,author=:author,edition=:edition,category=:category,libraryId=:libraryId,rackNo=:rackNo,status=:status,issuedTo=:issuedTo,dateOfissued=:dateOfissued,dateOfPurchase=:dateOfPurchase,price=:price,description=:description where bookId=:bookId";

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bookId", book.getBookId());
		map.put("bookName", book.getBookName());
		map.put("author", book.getAuthor());
		map.put("edition", book.getEdition());
		map.put("category", book.getCategory());
		map.put("libraryId", book.getLibraryId());
		map.put("rackNo", book.getRackNo());
		map.put("status", book.getStatus());
		map.put("issuedTo", book.getIssuedTo());
		map.put("dateOfissued", book.getDateOfIssued());
		map.put("dateOfPurchase", book.getDateOfPurchase());
		map.put("price", book.getPrice());
		map.put("description", book.getDescription());

		template.execute(sql, map, new PreparedStatementCallback<Object>() {
			@Override
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				return ps.executeUpdate();
			}
		});

	}

	@Override
	public void deleteBook(Books book) {
		logger.info("Invoking delete book DAO");
		final String sql = "delete from books where bookId=:bookId";

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("bookId", book.getBookId());

		template.execute(sql, map, new PreparedStatementCallback<Object>() {
			@Override
			public Object doInPreparedStatement(PreparedStatement ps) throws SQLException, DataAccessException {
				return ps.executeUpdate();
			}
		});

	}

}
