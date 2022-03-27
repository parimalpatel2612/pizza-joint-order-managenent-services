package com.ordermanagement.service;

import java.util.List;

import com.ordermanagement.model.Order;

public interface OrderService {
	public Order save(Order order);
	public List<Order> getOrders();
}
