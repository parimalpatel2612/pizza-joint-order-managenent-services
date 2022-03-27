package com.ordermanagement.service.impl;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ordermanagement.model.Order;
import com.ordermanagement.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{

	@Autowired
	private RestTemplate restTemplate;

	@Override
	public Order save(Order order) {		
		// send POST request

		//here we can use eureka server to get service IP from service name register in eureka
		String url = "http://order-persistence-service/orders";

		// build the request
		return restTemplate.postForObject(url, order, Order.class);

	}

	@Override
	public List<Order> getOrders() {
		// TODO Auto-generated method stub
		ResponseEntity<List<Order>> rateResponse = restTemplate.exchange("http://order-persistence-service/save/orders", HttpMethod.GET, null, new ParameterizedTypeReference<List<Order>>() {});
		return rateResponse.getBody();
	}

}
