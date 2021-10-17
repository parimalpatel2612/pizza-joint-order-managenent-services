package com.ordermanagement.model;


import java.io.Serializable;
import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Order implements Serializable{
	@JsonProperty("id")
	private int id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("quantity")
	private String quantity;
	@JsonProperty("price")
	private BigDecimal price;
	
	//if we need more information about product we can add here list of value object.
	
	public Order() {
	}
	
	public Order(String name, String quantity, BigDecimal price) {
		super();
		this.name = name;
		this.quantity = quantity;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Order [name=" + name + ", quantity=" + quantity + ", price=" + price + "]";
	}

}
