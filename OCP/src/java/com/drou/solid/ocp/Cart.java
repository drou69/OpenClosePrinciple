package com.drou.solid.ocp;

import java.util.ArrayList;
import java.util.List;

import com.drou.solid.ocp.Book;

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
		double totalWeight = 0;
		
		for (Book book : books) {
			totalWeight += book.getWeight();
		}
		
		return totalWeight;
	}
	
	public int getTotalBooks() {
		return this.books.size();
	}
}
