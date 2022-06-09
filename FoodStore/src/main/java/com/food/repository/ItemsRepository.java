package com.food.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.food.model.Items;


public interface ItemsRepository extends JpaRepository<Items, Integer> {

	@Query("select p from Items p where p.id=?1")
	List<Items> getbyid(int id);
	
	@Query("select p from Items p where p.name=?1")
	List<Items> getbyname(String name);
	
}
