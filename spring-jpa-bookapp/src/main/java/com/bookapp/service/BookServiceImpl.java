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

    //derived
    @Override
    public List<Book> findByAuthor(String author) {
        return repo.findByAuthor(author);
    }

    @Override
    public List<Book> findByCategory(String category) {
        return repo.findByCategory(category);
    }

    @Override
    public List<Book> findByPriceLessThan(double price) {
        return repo.findByPriceLessThan(price);
    }

    @Override
    public List<Book> findByCategoryAndPriceLessThan(String category, double price) {
        return repo.findByCategoryAndPriceLessThan(category,price);
    }

    //custom
    @Override
    public List<Book> findByAuth(String author) {
        return repo.findByAuth(author);
    }

    @Override
    public List<Book> findByCatAndPrice(String category, double price) {
        return repo.findByCatAndPrice(category,price);
    }

    @Override
    public List<Book> findByStartingTitle(String title) {
        return repo.findByStartingTitle(title);
    }
}
