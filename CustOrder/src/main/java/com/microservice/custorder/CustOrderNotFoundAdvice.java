package com.microservice.custorder;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class CustOrderNotFoundAdvice {
	@ResponseBody
	@ExceptionHandler(CustOrderNotFoundException.class)
	 @ResponseStatus(HttpStatus.NOT_FOUND)
	  String custOrderNotFoundHandler(CustOrderNotFoundException ex) {
	    return ex.getMessage();
	  }
}
