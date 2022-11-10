package com.example.classproject22.controller;

import com.example.classproject22.exception.ResourceNotFoundException;
import com.example.classproject22.model.Books;
import com.example.classproject22.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/")
public class BooksController {

    @Autowired
    private BookRepo bookRepo;

    // get all books
    @GetMapping(path = "books")
    public List<Books> getAllBooks(){ return this.bookRepo.findAll();}

    // get book by isbn
    @GetMapping(path = "/books/{isbn}")
    public ResponseEntity<Books> getBookByISBN(@PathVariable(value = "isbn") Long isbn)
            throws ResourceNotFoundException {
        Books books = bookRepo.findById(isbn).orElseThrow(() -> new ResourceNotFoundException("Book not found by this ISBN: " + isbn));
        return ResponseEntity.ok().body(books);
    }

    // get book by genre
    @GetMapping(path = "/books/searchGenre")
    public List<Books> searchBooksByGenre( @RequestParam(name = "genre", required = false) String genre) {
        if (genre != null) {
            return this.bookRepo.findBooksByGenre(genre);
        } else {
            return new ArrayList<>();
        }
    }

    // get book by average rating
    @GetMapping(path = "/books/searchRating")
    public List<Books> searchBooksByRating( @RequestParam(name = "average_rating", required = false) double average_rating) {
        if (average_rating >= 0 && average_rating <= 5) {
            return this.bookRepo.findBooksByRating(average_rating);
        } else {
            return new ArrayList<>();
        }
    }

    // get X books
    @GetMapping(path = "/books/bookNum")
    public List<Books> getBookX (@RequestParam(name = "number", required = true) int number, @RequestParam(name = "place", required = true) int place) {
        List<Books> bookList = new ArrayList<>();
        int size = this.bookRepo.findAll().size();
        if ((number + place) > size){
            number = size - place;
        }
        for (int i = 0; i < number; i++) {
            bookList.add(this.bookRepo.findAll(PageRequest.of(place,1)).getContent().get(0));
            place++;
        }
        return bookList;
    }

    // get Top Sellers
    @GetMapping(path = "/books/TopSellers")
    public List<Books> getTopSellers () {
        return this.bookRepo.findAll(PageRequest.of(0, 10, Sort.by(Sort.Direction.DESC, "copiessold"))).getContent();
    }

    // save book
    @PostMapping(path = "books")
    public Books createBook(@RequestBody Books books) {
        return this.bookRepo.save(books);
    }



}
