package com.example.springboot.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name="books")
public class Book {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long isbn;

    private String book_name;
    private String description;
    private Double price;
    private String author;
    private String genre;
    private String publisher;
    private Date year_published;

    public Book() {
    }

    public Long getIsbn() {
        return isbn;
    }

    public String getBook_name() {
        return book_name;
    }

    public String getDescription() {
        return description;
    }

    public Double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public Date getYear_published() {
        return year_published;
    }
}
