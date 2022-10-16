package com.example.springbootapp.Respository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootapp.Model.wishlist;

public interface WishlistRepository extends JpaRepository<wishlist, Long>{
	
	@Override
    List<wishlist> findAll();
}
