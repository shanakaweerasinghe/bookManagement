package com.esad.lms.bookmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.esad.lms.bookmanagement")
public class BookmanagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookmanagementApplication.class, args);
		System.out.println("Started");

	}

}
