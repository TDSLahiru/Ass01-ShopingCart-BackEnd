package com.sl.shopingCart.exception;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionAdHelper {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@ExceptionHandler(value = { ProductNotFoundException.class })
	public ResponseEntity<Object> handleInvalidInputException(ProductNotFoundException ex) {

		logger.error("Invalid Input Exception: ", ex.getMessage());
		return new ResponseEntity<Object>(
				new AppException(ex.getMessage(), HttpStatus.BAD_REQUEST, ZonedDateTime.now(ZoneId.of("Z")))

				, HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(value = { Exception.class })
	public ResponseEntity<Object> handleException(Exception ex) {
		logger.error("Exception: ", ex.getMessage());
		return new ResponseEntity<Object>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
}