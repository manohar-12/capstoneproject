package com.food.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.food.model.User;

public interface userRepository extends JpaRepository<User,Integer>{

	
}
