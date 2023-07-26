package com.libraryManagementSystem;

public class InvalidDateInLibraryException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


	public InvalidDateInLibraryException() {
		super();
		// TODO Auto-generated constructor stub
		
	}


	public InvalidDateInLibraryException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}


	public InvalidDateInLibraryException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}


	public InvalidDateInLibraryException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}


	public InvalidDateInLibraryException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Invalid date Details \n enter the proper detail.. ";
	}

	
}
