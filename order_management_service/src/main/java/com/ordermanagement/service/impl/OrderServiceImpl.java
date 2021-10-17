package com.ordermanagement.service.impl;


import java.util.Collections;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
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
		String url = "http://localhost:8098/orders";

		// build the request
		return restTemplate.postForObject(url, order, Order.class);

	}

}
