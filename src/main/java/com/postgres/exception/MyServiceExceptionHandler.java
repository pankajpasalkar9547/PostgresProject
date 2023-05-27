package com.postgres.exception;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class MyServiceExceptionHandler {
	@ExceptionHandler(NoStudentFoundException.class)
	public ResponseEntity<String> handleNoDataException(NoStudentFoundException ex) {
		return new ResponseEntity<String>("No Values Present", HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> handleNullPointerException(NullPointerException ex) {
		return new ResponseEntity<String>("Name Cannot sdsdBe null", HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler(NoSuchElementException.class)
	public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException ex) {
		return new ResponseEntity<String>("Name Cannot vvBe null", HttpStatus.NOT_FOUND);
	}
}
