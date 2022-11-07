package com.example.springboot.model;

import java.util.List;

public class CartCost {
	private List<Cart> cartItems;
    private double totalCost;

    public CartCost(List<Cart> cartList, double totalCost){
        this.cartItems = cartList;
        this.totalCost = totalCost;
    }

    public List<Cart> getCartItems() {
        return cartItems;
    }

    public void setCartItems(List<Cart> cartItems) {
        this.cartItems = cartItems;
    }

    public double getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

    @Override
    public String toString() {
        return "CartCost{" +
                "cartItems=" + cartItems +
                ", totalCost=" + totalCost +
                '}';
    }
}
