package com.developmentExceptions.exceptions;

public class ShouldImplementException extends RuntimeException {

    public String getMessage() {
        return "This method should be implemented by the class.";
    }
	
}
