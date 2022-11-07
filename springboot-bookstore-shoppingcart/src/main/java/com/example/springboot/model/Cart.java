package com.example.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.sun.istack.NotNull;

@Entity
@Table(name="cart")
public class Cart {

	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer cart_id;

	    @Column(name="book_id")
	    private Long book_id;

	    @Column(name="username")
	    private String username;

	    @ManyToOne
	    @JoinColumn(name = "book_id", referencedColumnName = "isbn",insertable = false, updatable = false)
	    private Book book;

	    private int quantity;

	    public Cart(){

	    }

	    public Cart(@NotNull Long book_id, @NotNull Integer quantity){
	        this.book_id = book_id;
	        this.quantity = quantity;
	    }

	    //fix
	    public Cart(Integer cart_id, String username, Book book, int quantity) {
	        this.cart_id = cart_id;
	        this.username = username;
	        this.book = book;
	        this.quantity = quantity;
	    }



	    @Override
	    public String toString() {
	        return "Cart{" +
	                "cart_item_id=" + cart_id +
	                ", username='" + username + '\'' +
	                ", quantity=" + quantity +
	                ", book name" + book.getBook_name() +
	                '}';
	    }


	    public Integer getCart_id() {
	        return cart_id;
	    }

	    public void setCart_id(Integer cart_id) {
	        this.cart_id = cart_id;
	    }

	    public Long getBook_id() {
	        return book_id;
	    }

	    public void setBook_id(Long book_id) {
	        this.book_id = book_id;
	    }

	    public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public Book getBook() {
	        return book;
	    }

	    public void setBook(Book book) {
	        this.book = book;
	    }

	    public int getQuantity() {
	        return quantity;
	    }

	    public void setQuantity(int quantity) {
	        this.quantity = quantity;
	    }
}


