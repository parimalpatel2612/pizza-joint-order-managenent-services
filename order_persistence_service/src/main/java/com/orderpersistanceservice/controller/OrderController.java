package com.orderpersistanceservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.orderpersistanceservice.model.Order;
import com.orderpersistanceservice.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	@PostMapping(value = "/orders", produces = MediaType.APPLICATION_JSON_VALUE)
	public Order createOrder(@RequestBody Order order) {
		try {
			System.out.println(order);
			Order _order = orderService.createOrdoer(order);
			return _order;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	
	@GetMapping("save/orders")
	public List<Order> getOrders(){
		return orderService.getOrder();
		
	}
}
