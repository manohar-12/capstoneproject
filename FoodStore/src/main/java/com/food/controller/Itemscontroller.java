package com.food.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.model.Items;
import com.food.repository.ItemsRepository;

@RestController
@RequestMapping("/FoodStore/")
public class Itemscontroller {

	@Autowired
	private ItemsRepository itemsrep;
	
	
	
	//get all the food items
	@GetMapping("/items")
	public List<Items> getAllitems(){
		return itemsrep.findAll();
	}
	
	@PostMapping("/add")
	public Items Add(@RequestBody Items item) {
		return itemsrep.save(item);
	}
	@PutMapping(value = "/update")
	public Items itemUpdate(@RequestBody Items item) {
		return itemsrep.save(item);
	}
    
	@GetMapping(value="/search/id/{id}")
	public Optional<Items> getItems(@PathVariable int id) {
		return itemsrep.findById(id);
	}
	@GetMapping(value = "/search/name/{sn}")
	public List<Items> getItems(@PathVariable String sn){
		List<Items> item = (List<Items>) itemsrep.getbyname(sn);
		return item;
	}

	@DeleteMapping(value = "/delete/{id}")
	public void deleteItemId(@PathVariable int id) {
		itemsrep.deleteById(id);
	}
	}
	
	

