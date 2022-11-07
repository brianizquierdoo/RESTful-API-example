package com.example.classproject22.model;

import java.util.Date;

public class Reviews {

    private String username;
    private Long isbn;
    private Date date;
    private int review;
    private String comment;

    public Reviews() {
        super();
    }

    public Reviews(String username, Long isbn, Date date, int review, String comment) {
        this.username = username;
        this.isbn = isbn;
        this.date = date;
        this.review = review;
        this.comment = comment;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getIsbn() {
        return isbn;
    }

    public void setIsbn(Long isbn) {
        this.isbn = isbn;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}
