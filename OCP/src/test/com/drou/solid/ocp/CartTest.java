package com.drou.solid.ocp;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class CartTest {
	
	private Cart cart;
	
	@Before
	public void init() {
		this.cart = new Cart();
	}

	@Test
	public void should_be_able_tell_that_the_cart_is_empty() {
		assertEquals(0, this.cart.getTotalBooks());
	}
	
	@Test
	public void should_be_able_to_add_a_book_to_cart() {
		this.cart.addBookToCart(new Book("Le petit Prince", 12.99, 0.56));
		
		assertEquals(1, this.cart.getTotalBooks());
	}
	
	@Test
	public void should_be_able_to_contain_many_books_in_the_cart() {
		this.cart.addBookToCart(new Book("Eloquent Ruby", 18.99, 1.5));
		this.cart.addBookToCart(new Book("It", 29.99, 3.23));
		this.cart.addBookToCart(new Book("Cooks Illustrated", 32.99, 2.13));
		
		assertSame(3, this.cart.getTotalBooks());
	}

	@Test
	public void should_have_zero_for_total_price_when_cart_is_empty() {
		assertEquals(0.0, this.cart.calculateCartPrice(), 0);
	}
	
	@Test
	public void should_be_able_to_calculate_total_price_for_cart() {
		this.cart.addBookToCart(new Book("Eloquent Ruby", 18.99, 1.5));
		this.cart.addBookToCart(new Book("It", 29.99, 3.23));
		this.cart.addBookToCart(new Book("Cooks Illustrated", 32.99, 2.13));
		
		assertEquals(81.97, this.cart.calculateCartPrice(), 0);
	}
		
	@Test
	public void should_have_zero_for_total_weight_when_cart_is_empty() {
		assertEquals(0, this.cart.calculateBooksWeight(), 0);
	}
	
	@Test
	public void should_be_able_to_calculate_total_weight_for_cart() {
		this.cart.addBookToCart(new Book("Eloquent Ruby", 18.99, 1.5));
		this.cart.addBookToCart(new Book("It", 29.99, 3.23));
		this.cart.addBookToCart(new Book("Cooks Illustrated", 32.99, 2.13));
		
		assertEquals(6.86, this.cart.calculateBooksWeight(), 0);
	}
}
