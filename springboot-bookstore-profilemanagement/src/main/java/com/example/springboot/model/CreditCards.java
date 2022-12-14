package com.example.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;





@Entity
@Table(name = "creditcards", schema = "public")
public class CreditCards {
    
	@Id
	private String credit_card_number;
	
	@Column(name = "name_on_card")
	private String name_on_card;
	
	@Column(name = "expiration_date")
	private String expiration_date;
	
	@Column(name = "cvv")
	private String cvv;
	
	@Column(name = "address")
	private String address;
	
	@Column(name = "username")
	private String username;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinColumn(name = "username", referencedColumnName = "username", insertable = false, updatable = false)
	@JsonIgnore
	private User user;
	
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getCredit_card_number() {
		return credit_card_number;
	}
	public void setCredit_card_number(String credit_card_number) {
		this.credit_card_number = credit_card_number;
	}

	public String getName_on_card() {
		return name_on_card;
	}
	public void setName_on_card(String name_on_card) {
		this.name_on_card = name_on_card;
	}
	public String getExpiration_date() {
		return expiration_date;
	}
	public void setExpiration_date(String expiration_date) {
		this.expiration_date = expiration_date;
	}
	public String getCvv() {
		return cvv;
	}
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
}
