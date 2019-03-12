package com.byteparity.store.location.admin.portlet.exception;

@SuppressWarnings("serial")
public class StoreLocationEmptyFieldException extends Exception {
	public StoreLocationEmptyFieldException() { super(); }
	public StoreLocationEmptyFieldException(String message) { super(message); }
	public StoreLocationEmptyFieldException(String message, Throwable cause) { super(message, cause); }
	public StoreLocationEmptyFieldException(Throwable cause) { super(cause); }	
}
