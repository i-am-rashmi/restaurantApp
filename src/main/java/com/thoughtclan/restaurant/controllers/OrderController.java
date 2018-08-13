package com.thoughtclan.restaurant.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.thoughtclan.restaurant.repository.OrderDetailsRepository;
import com.thoughtclan.restaurant.repository.OrderRepository;

@RestController
public class OrderController
{
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private OrderDetailsRepository orderDetailsRepository;
	
	// 
	
	

}
