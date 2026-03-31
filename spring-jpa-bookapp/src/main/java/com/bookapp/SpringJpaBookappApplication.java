package com.bookapp;

import com.bookapp.model.Book;
import com.bookapp.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaBookappApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaBookappApplication.class, args);
	}

    private IBookService service;

    @Autowired
    public void setService(IBookService service) {
        this.service = service;
    }

    @Override
    public void run(String... args) throws Exception {

        Book book = new Book("struts in action","unknown",12,550,"Tech");
        service.addBook(book);


        System.out.println(service.getById(10));
        System.out.println(service.getById(11));
        System.out.println(service.getById(12));

 }
}