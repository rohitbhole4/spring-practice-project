package com.bookapp.repository;

import com.bookapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookRepository extends JpaRepository<Book,Integer> {

    //derived queries
    List<Book> findByAuthor(String author);
    List<Book> findByCategory(String category);
    List<Book> findByPriceLessThan(double price);
    List<Book> findByCategoryAndPriceLessThan(String category, double price);
}
