package com.esad.lms.bookmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication(scanBasePackages="com.esad.lms.bookmanagement")
//@ComponentScan({"com.esad.lms.bookmanagement.service.BookService"})
public class BookmanagementApplication {
	
	
	//BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookmanagementApplication.class, args);
		System.out.println("weda weda");
	
		//BookRepository.name();
		
	}

}
