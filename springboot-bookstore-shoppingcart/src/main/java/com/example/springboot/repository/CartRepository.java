package com.example.springboot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springboot.model.Cart;

@Repository
public interface CartRepository extends JpaRepository<Cart,Integer> {

    List<Cart> findAllByUsername(String username);


} 


