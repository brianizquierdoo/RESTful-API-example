package com.example.springbootapp.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "wishlist")
public class wishlist {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String wishlist_id;
	
	@Column(name = "isbn")
	String isbn;
	
	@Column(name = "username")
	String username;

	public String getWishlist_id() {
		return wishlist_id;
	}

	public void setWishlist_id(String wishlist_id) {
		this.wishlist_id = wishlist_id;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	
}