package com.food.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.food.model.User;
import com.food.repository.userRepository;

@RestController
@Repository
@RequestMapping("/user/")
public class userController {

		@Autowired
		private userRepository userrep;
		
		
		//get all the food items
		@GetMapping("/users")
		public List<User> getAllUsers(){
			return userrep.findAll();		
}
		@PostMapping("/add")
		public User Add(@RequestBody User user) {
			return userrep.save(user);
		}
		
		
}