package com.bookapp.service;

import com.bookapp.model.Book;

import java.util.List;

public interface IBookService {
    Book addBook(Book book);
    Book updateBook(Book book);
    void deleteBook(int bookId);

    Book getById(int bookId);
    List<Book> getAll();

    //derived queries
    List<Book> findByAuthor(String author);
    List<Book> findByCategory(String category);
    List<Book> findByPriceLessThan(double price);
    List<Book> findByCategoryAndPriceLessThan(String category, double price);

}
