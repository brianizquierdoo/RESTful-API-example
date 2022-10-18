package com.example.springbootapp.Respository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springbootapp.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User, String>{
	
	@Override
    List<User> findAll();
    
}
