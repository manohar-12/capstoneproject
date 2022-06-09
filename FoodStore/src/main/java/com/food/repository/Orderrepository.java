package com.food.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.food.model.Order;

public interface Orderrepository extends JpaRepository<Order, Integer> {

}
