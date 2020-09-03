package com.example.order;

public class OrderItemNotFoundException extends RuntimeException {

	OrderItemNotFoundException(Long id) { super("Could not find OrderItem " +
			   id); }
	 

}
