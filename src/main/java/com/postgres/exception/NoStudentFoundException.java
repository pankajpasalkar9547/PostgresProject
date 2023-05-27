package com.postgres.exception;

import org.springframework.stereotype.Component;

@Component
public class NoStudentFoundException extends RuntimeException{

	public NoStudentFoundException(String string) {
		super("No Data found");
	}

	public NoStudentFoundException() {
		super();
	}
	
	
	
}
