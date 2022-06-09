package com.food.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.food.model.Order;
import com.food.repository.Orderrepository;

@RestController
@RequestMapping("/Order")
public class OrderController {

	@Autowired
	private Orderrepository orderrep;
	
	@GetMapping("/oredrs")
	public List<Order> getAllOrders(){
		return orderrep.findAll();
	}
	@PostMapping("/add")
	public Order add(@RequestBody Order order) {
		return orderrep.save(order);
	}
}
