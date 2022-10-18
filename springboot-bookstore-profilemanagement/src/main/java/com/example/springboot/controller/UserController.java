package com.example.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.exception.ResourceNotFoundException;
import com.example.springboot.model.User;
import com.example.springboot.repository.UserRepository;

@RestController
@RequestMapping("/api/v1/")
public class UserController {
	@Autowired
	private UserRepository userRepository;

	// Get User
	@GetMapping("/Users")
	public List<User> getAllUsers() {
		return userRepository.findAll();
	}

	// Get User by Username
	@GetMapping("/Users/{username}")
	public ResponseEntity<User> getUserByUsername(@PathVariable(value = "username") String username) throws ResourceNotFoundException {
		User user = userRepository.findById(username)
				.orElseThrow(() -> new ResourceNotFoundException("User not found for this username :: " + username));
		return ResponseEntity.ok().body(user);
	}

	// Create User
	@PostMapping("/Users")
	public User createUser(@RequestBody User username) {
		return userRepository.save(username);
	}

	// Update User
	@PutMapping("/Users/{username}")
	public ResponseEntity<User> updateUser(@PathVariable(value = "username") String username,
			@RequestBody User userDetails) throws ResourceNotFoundException {
		User user = userRepository.findById(username)
				.orElseThrow(() -> new ResourceNotFoundException("User not found for this username :: " + username));
		
		user.setName(userDetails.getName());
		user.setPassword(userDetails.getPassword());
		user.setAddress(userDetails.getAddress());
		user.setAdmin(userDetails.isAdmin());
		final User updatedUser = userRepository.save(user);
		return ResponseEntity.ok(updatedUser);
	}
}
