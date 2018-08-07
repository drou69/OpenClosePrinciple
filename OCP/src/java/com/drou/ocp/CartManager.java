package com.drou.ocp;

import com.drou.ocp.Book;
import com.drou.ocp.Cart;

public class CartManager {

	public static void main(String[] args) {
		Cart cart = new Cart();
		
		cart.addBookToCart(new Book("DaVinci Code", 15.99, 3.525));
		cart.addBookToCart(new Book("Clean Code", 25.99, 2.25));
		cart.addBookToCart(new Book("Les Fleurs du Mal", 10.99, 1.25));
		
		System.out.println(cart.listBooks());
		System.out.println("Total price sums up to: $" + cart.calculateCartPrice() + "\n");
		System.out.println("Total weight sums up to: " + cart.calculateBooksWeight() + " pounds\n");
	}
}