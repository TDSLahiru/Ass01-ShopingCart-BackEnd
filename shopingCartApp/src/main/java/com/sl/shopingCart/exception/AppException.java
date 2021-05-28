package com.sl.shopingCart.exception;

import java.time.ZonedDateTime;

import org.springframework.http.HttpStatus;

import lombok.Getter;

@Getter
public class AppException {
	
	
	private final String Message ;
	private final HttpStatus httpStatus ;
	private final ZonedDateTime timstamp ;
	

	public AppException(String message, HttpStatus httpStatus, ZonedDateTime timstamp) {
		super();
		Message = message;
		this.httpStatus = httpStatus;
		this.timstamp = timstamp;
	}
   
}
