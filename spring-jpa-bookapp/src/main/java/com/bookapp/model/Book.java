package com.bookapp.model;

import jakarta.persistence.*;

@Entity
public class Book {
    private String title;
    private String author;
    @Id
    @GeneratedValue(generator = "book_gen",strategy = GenerationType.AUTO)
    @SequenceGenerator(name = "book_gen",sequenceName = "book_seq",initialValue = 10,allocationSize = 1)
    private Integer bookId;
    private double price;
    private String category;


    public Book() {
    }

    public Book(String title, String author, double price, String category) {
        this.title = title;
        this.author = author;
//        this.bookId = bookId;
        this.price = price;
        this.category = category;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", bookId=" + bookId +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
