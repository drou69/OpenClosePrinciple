package com.drou.ocp;

public class Book {
	private String name;
	private double price;
	private double weight;
	
	public Book(String name, double cost, double weight) {
		super();
		this.name = name;
		this.price = cost;
		this.weight = weight;
	}
	
	public String getName() {
		return name;
	}
	public double getPrice() {
		return price;
	}
	public double getWeight() {
		return weight;
	}
}