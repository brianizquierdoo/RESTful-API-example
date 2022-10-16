package com.example.springbootapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootapp.Model.author;
import com.example.springbootapp.Model.wishlist;
import com.example.springbootapp.Respository.BooksRepository;
import com.example.springbootapp.Respository.WishlistRepository;

@RestController
@RequestMapping("/api/v1/")
public class springbootController {

	@Autowired
	private BooksRepository booksRepository;
	
	@GetMapping("/author")
	List<author> getAllBooks(){
		return booksRepository.findAll();
	}
	
	@Autowired
	private WishlistRepository wishlistRepository;
	@GetMapping("/wishlist")
	List<wishlist> getAllWishlist(){
		return wishlistRepository.findAll();
	}
			
	@GetMapping("/welcome")
	public String welcome(){
		return "Welcome!";
	}
		
}
