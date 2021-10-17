package com.orderpersistanceservice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.orderpersistanceservice.model.Order;
import com.orderpersistanceservice.repository.OrderRepository;
import com.orderpersistanceservice.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private OrderRepository orderRepository;

	@Override
	public Order createOrdoer(Order order) {
		return  orderRepository.save(order);		
	}
	
	
	
}
