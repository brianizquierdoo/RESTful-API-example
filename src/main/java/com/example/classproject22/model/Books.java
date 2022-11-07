package com.example.classproject22.model;

import javax.persistence.*;
import java.util.Date;

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

    @Column(name = "copiessold")
    private int copiessold;

    @Column(name = "average_rating")
    private double average_rating;

    public Books() {
        super();
    }

    public Books(long isbn, String book_name, String description, double price, String author, String genre,
                 String publisher, Date year_published, int copiessold, double average_rating) {
        this.isbn = isbn;
        this.book_name = book_name;
        this.description = description;
        this.price = price;
        this.author = author;
        this.genre = genre;
        this.publisher = publisher;
        this.year_published = year_published;
        this.copiessold = copiessold;
        this.average_rating = average_rating;
    }

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

    public int getCopiessold() {
        return copiessold;
    }

    public void setCopiesSold(int copiessold) {
        this.copiessold = copiessold;
    }

    public double getAverage_rating() {
        return average_rating;
    }

    public void setAverage_rating(double average_rating) {
        this.average_rating = average_rating;
    }
}
