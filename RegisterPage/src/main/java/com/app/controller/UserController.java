package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.User;
import com.app.repository.UserRepo;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {
	
	@Autowired
	private UserRepo repository;
	
	@PostMapping("/user")
	public ResponseEntity<User> registerUser(@RequestBody User user) {
	 return ResponseEntity.ok(this.repository.save(new User(user.getEmail(),user.getFirstname(), user.getLastname(), user.getUserId())));
	}

}
