package com.cognizant.bookmyseat.exception;

public class BookMySeatException extends Exception{

	private static final long serialVersionUID = 1L;

	public BookMySeatException(String message){
		super(message);
	}
	
	public BookMySeatException(Throwable throwable){
		super(throwable);
	}
	
	public BookMySeatException(String message, Throwable throwable){
		super(message, throwable);
	}
}
