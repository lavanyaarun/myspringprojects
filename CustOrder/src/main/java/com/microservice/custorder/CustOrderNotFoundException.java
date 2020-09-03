package com.microservice.custorder;

public class CustOrderNotFoundException extends RuntimeException {

	CustOrderNotFoundException(Long id) { super("Could not find Cust Order " +
			   id); }
	 

}
