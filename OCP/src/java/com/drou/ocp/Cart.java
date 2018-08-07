package com.drou.ocp;

import java.util.ArrayList;
import java.util.List;

import com.drou.ocp.Book;

public class Cart {

	private List<Book> books = new ArrayList<Book>();
	
	public void addBookToCart(Book book) {
		this.books.add(book);
	}
	
	public double calculateCartPrice() {
		double totalPrice = 0;
		
		for (Book book : books) {
			totalPrice += book.getPrice();
		}
		
		return totalPrice;
	}
	
	public double calculateBooksWeight() {
		int totalWeight = 0;
		
		for (Book book : books) {
			totalWeight += book.getWeight();
		}
		
		return totalWeight;
	}
	
	public String listBooks() {
		StringBuilder builder = new StringBuilder();
		builder.append("The Cart contains the following books: ").append("\n\n");
		
		for (Book book : books) {
			builder.append(book.getName()).append(", cost: $").append(book.getPrice()).append("\n");
		}
		
		return builder.toString();
	}
}
