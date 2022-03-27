package com.orderpersistanceservice.service;

import java.util.List;

import com.orderpersistanceservice.model.Order;

public interface OrderService {
	public Order createOrdoer(Order order);
	
	public List<Order> getOrder();
}
