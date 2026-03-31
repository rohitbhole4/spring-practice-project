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

       // Book book = new Book("struts in action","unknown",12,550,"Tech");
       // service.addBook(book);

//        Book nbook = service.getById(10) ;
//        nbook.setTitle("Headfirst java");
//        service.updateBook(nbook);
//
//        System.out.println(service.getById(10));
//        System.out.println(service.getById(11));
//        System.out.println(service.getById(12));
//
//        System.out.println();
//
//        service.getAll().forEach(System.out::println);
//

//        for (int i=0; i<10;i++) {
//            Book book = new Book("secret version : "+i, "ronda"+i, 550+i, "Tech");
//            service.addBook(book);
//        }

        Book book = new Book("inspiration","robin",987,"life");
        service.addBook(book);


 }
}