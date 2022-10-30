package com.CS.GeekText.controller;

import com.CS.GeekText.exceptions.ResourceNotFoundException;
import com.CS.GeekText.model.Authors;
import com.CS.GeekText.model.Books;
import com.CS.GeekText.repository.AuthorRepository;
import com.CS.GeekText.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class GeekTextController {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorsRepository;

    @GetMapping("books")
    public List<Books> getAllBooks() {
        return this.bookRepository.findAll();
    }

    @GetMapping("books/{isbn}")
    public ResponseEntity<Books> getBookByIsbn(@PathVariable(value = "isbn") Long bookIsbn)
            throws ResourceNotFoundException {
        Books book = bookRepository.findById(bookIsbn)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found for this ISBN :: " + bookIsbn));
        return ResponseEntity.ok().body(book);
    }

    @GetMapping("authors")
    public List<Authors> getAllAuthors() {
        return this.authorsRepository.findAll();
    }

//    @GetMapping("authors/{author_id}")
//    public ResponseEntity<Authors> getBookByAuthors(@PathVariable(value = "author_id") int authorId)
//            throws ResourceNotFoundException {
//        Authors authors = authorsRepository.findById(authorId)
//                .orElseThrow(() -> new ResourceNotFoundException("Book not found for this ISBN :: " + authorId));
//        return ResponseEntity.ok().body(authors);
//    }

//    @GetMapping("books/author/{author_id}")
//    public ResponseEntity<Books> getBookByAuthor(@PathVariable(value = "author_id") Long authorId)
//            throws ResourceNotFoundException {
//        Books authors = bookRepository.findById(authorId)
//                .orElseThrow(() -> new ResourceNotFoundException("Book not found for this Author : " + authorId));
//        return ResponseEntity.ok().body(authors);
//    }

    @GetMapping("/books/authors/")
    public ResponseEntity<List<Books>> getAllTutorials(@RequestParam(required = false) String author) {
        try {
            List<Books> books = new ArrayList<Books>();

            if (author == null)
                bookRepository.findAll().forEach(books::add);
            else
                bookRepository.findByAuthor(author).forEach(books::add);

            if (books.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(books, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    // Create Book
    @PostMapping("books")
    public Books createBook(@RequestBody Books book_name) {
        return bookRepository.save(book_name);
    }

    // Create Author
    @PostMapping("authors")
    public Authors createAuthor(@RequestBody Authors getF_name) {
        return authorsRepository.save(getF_name);
    }

    // Update User
//    @PutMapping("/books/{isbn}")
//    public ResponseEntity<Books> updateBook(@PathVariable(value = "bookIsbn") Long bookIsbn,
//                                           @RequestBody Books bookDetails) throws ResourceNotFoundException {
//        Books book = bookRepository.findById(bookIsbn)
//                .orElseThrow(() -> new ResourceNotFoundException("Book not found for this ISBN : " + bookIsbn));
//
//        book.setBook_name(bookDetails.getBook_name());
//        book.setAuthor(bookDetails.getAuthor());
//        book.setDescription(bookDetails.getDescription());
//        book.setGenre(bookDetails.getGenre());
//        book.setPrice(bookDetails.getPrice());
//        book.setPublisher(bookDetails.getPublisher());
//        book.setAuthor(bookDetails.getAuthor());
//        book.setYear_published(bookDetails.getYear_published());
//
//        return ResponseEntity.ok(this.bookRepository.save(book));
//    }

}
