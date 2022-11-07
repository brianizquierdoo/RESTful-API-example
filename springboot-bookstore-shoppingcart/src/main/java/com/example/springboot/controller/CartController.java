package com.example.springboot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.Cart;
import com.example.springboot.model.CartCost;
import com.example.springboot.service.CartService;



@RestController
@RequestMapping(path="api/v1/cart")
public class CartController {

	    @Autowired
	    private CartService cartService;


	    //display all items in cart and total cost of them
	    @GetMapping
	    public CartCost getCartCost(@RequestParam String username){
	        return cartService.listCartItems(username);
	    }



	    @PostMapping
	    public void addToCart(@RequestBody Cart cart, @RequestParam String username){
	        cartService.addToCart(cart,username);
	    }


	    //delete a book from user's cart
	    @DeleteMapping(path="{cartItemId}")
	    public void deleteCartItem(@PathVariable("cartItemId") Integer itemId, @RequestParam String username){
	        cartService.deleteCartItem(itemId,username);
	    }


	    //let user update quantity of an existing book item in cart
	    @PutMapping("/update/{cartItemId}")
	    public void updateCartItem(@PathVariable("cartItemId")Integer itemId, @RequestBody Cart cart, @RequestParam String username){
	        cartService.updateCartItem(itemId,cart, username);
	    }
}
