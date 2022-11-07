package com.example.classproject22.model;

import javax.persistence.*;

@Entity
@Table(name = "author", schema = "public")
public class Author {

    @Column(name = "fname")
    private String fname;

    @Column(name = "lname")
    private String lname;

    @Column(name = "biography")
    private String biography;

    @Column(name = "publisher")
    private String publisher;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long author_id;

    public Author() {
        super();
    }

    public Author(String fname, String lname, String biography, String publisher) {
        super();
        this.fname = fname;
        this.lname = lname;
        this.biography = biography;
        this.publisher = publisher;
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

    public long getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(long author_id) {
        this.author_id = author_id;
    }


}
