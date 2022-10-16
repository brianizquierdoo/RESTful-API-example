package com.example.springbootapp.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "author")
public class author {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	String authorid;
	
	@Column(name = "fname")
	String fname;
	
	@Column(name = "lname")
	String lname;
	
	@Column(name = "biography")
	String biography;
	
	@Column(name = "publisher")
	String publisher;

	
	

	public String getAuthor_id() {
		return authorid;
	}

	public void setAuthor_id(String author_id) {
		this.authorid = author_id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public String getBiography() {
		return biography;
	}

	public void setBiography(String biography) {
		this.biography = biography;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

}