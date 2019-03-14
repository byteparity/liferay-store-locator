package com.byteparity.store.location.admin.portlet.exception;

@SuppressWarnings("serial")
public class StoreLocationNonStringException extends Exception {
	public StoreLocationNonStringException() { super(); }
	public StoreLocationNonStringException(String message) { super(message); }
	public StoreLocationNonStringException(String message, Throwable cause) { super(message, cause); }
	public StoreLocationNonStringException(Throwable cause) { super(cause); }	
}
