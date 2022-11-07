package com.example.classproject22.model;

import javax.persistence.*;
import java.util.Date;

public class Orders {

 private int order_number;
 private String username;
 private Long isbn;
 private Date date_ordered;
 private int amount_ordered;

    public Orders() {
        super();
    }

    public Orders(int order_number, String username, Long isbn, Date date_ordered, int amount_ordered) {
        this.order_number = order_number;
        this.username = username;
        this.isbn = isbn;
        this.date_ordered = date_ordered;
        this.amount_ordered = amount_ordered;
    }

    public int getOrder_number() {
        return order_number;
    }

    public void setOrder_number(int order_number) {
        this.order_number = order_number;
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

    public Date getDate_ordered() {
        return date_ordered;
    }

    public void setDate_ordered(Date date_ordered) {
        this.date_ordered = date_ordered;
    }

    public int getAmount_ordered() {
        return amount_ordered;
    }

    public void setAmount_ordered(int amount_ordered) {
        this.amount_ordered = amount_ordered;
    }
}
