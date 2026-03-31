package com.bookapp.service;

import com.bookapp.model.Book;

import java.util.List;

public interface IBookService {
    Book addBook(Book book);
    Book updateBook(Book book);
    void deleteBook(int bookId);

    Book getById(int bookId);
    List<Book> getAll();
}
