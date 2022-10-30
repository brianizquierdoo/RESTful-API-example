package com.CS.GeekText.model;

import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "books", schema = "public")
public class Books {

    @Id
    private long isbn;

    @Column(name = "book_name")
    private String book_name;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private double price;

    @Column(name = "author")
    private String author;

    @Column(name = "genre")
    private String genre;

    @Column(name = "publisher")
    private String publisher;

    @Column(name = "year_published")
    private Date year_published;

    @Column(name = "author_id")
    private int author_id;


    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public Date getYear_published() {
        return year_published;
    }

    public void setYear_published(Date year_published) {
        this.year_published = year_published;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    @Override
    public String toString() {
        return "Books{" +
                "ISBN=" + isbn +
                ", bookName='" + book_name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", publisher='" + publisher + '\'' +
                ", yearPublished='" + year_published + '\'' +
                ", authorId=" + author_id + '\'' +
                '}';
    }

}
