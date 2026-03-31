package com.bookapp.service;

import com.bookapp.model.Book;
import com.bookapp.repository.IBookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements IBookService{

    private IBookRepository repo;

    @Autowired
    public void setRepo(IBookRepository repo) {
        this.repo = repo;
    }

    @Override
    public Book addBook(Book book) {
        return repo.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        return repo.save(book);
    }

    @Override
    public void deleteBook(int bookId) {
        repo.deleteById(bookId);
    }

    @Override
    public Book getById(int bookId) {
        Optional<Book> bookOpt = repo.findById(bookId);
        return bookOpt.orElse(null);
    }

    @Override
    public List<Book> getAll() {
        return repo.findAll();
    }
}
