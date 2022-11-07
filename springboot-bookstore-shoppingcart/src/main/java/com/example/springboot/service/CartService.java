package com.example.springboot.service;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.springboot.exceptions.CartItemNotExistException;
import com.example.springboot.model.Cart;
import com.example.springboot.model.CartCost;
import com.example.springboot.repository.CartRepository;

@Service
@Transactional
public class CartService {
	private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository){
        this.cartRepository = cartRepository;
    }



    public void addToCart(Cart cart, String username){
        cart.setUsername(username);
        cartRepository.save(cart);
    }


    public CartCost listCartItems(String username){
        List<Cart> cartList = cartRepository.findAllByUsername(username);
        List<Cart> cartItems = new ArrayList<>();
        for(Cart cart: cartList){
            cartItems.add(cart);
        }
        double totalCost = 0;
        for(Cart cart:cartItems){
            totalCost += (cart.getBook().getPrice()*cart.getQuantity());
        }
        CartCost cartCost = new CartCost(cartItems,totalCost);
        return cartCost;
    }



    public void updateCartItem(Integer cartItemId, Cart cart, String username) throws CartItemNotExistException{
        if(!cartRepository.existsById(cartItemId))
            throw new CartItemNotExistException("Cart-Item's ID " + cart.getCart_id() + " is invalid.");

        cart.setUsername(username);
        cart.setCart_id(cartItemId);
        cart.setQuantity(cart.getQuantity());
        cart.setBook_id(cart.getBook_id());

        cartRepository.save(cart);
    }



    public void deleteCartItem(Integer itemId, String username) throws CartItemNotExistException {
        if(!cartRepository.existsById(itemId))
        throw new CartItemNotExistException("Cart-Item's ID " + itemId + " is invalid.");

        cartRepository.deleteById(itemId);
    }



}
