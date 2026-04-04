package com.bookapp.repository;

import com.bookapp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBookRepository extends JpaRepository<Book,Integer> {

    //derived queries
    List<Book> findByAuthor(String author);
    List<Book> findByCategory(String category);
    List<Book> findByPriceLessThan(double price);
    List<Book> findByCategoryAndPriceLessThan(String category, double price);

    //custom
    @Query("from Book b where b.author=?1")
    List<Book> findByAuth(String author);
    @Query("from Book b where b.category=?1 and b.price=?2")
    List<Book> findByCatAndPrice(String category, double price);
    @Query("from Book b where b.title like ?1%")
    List<Book> findByStartingTitle(String title);
}
