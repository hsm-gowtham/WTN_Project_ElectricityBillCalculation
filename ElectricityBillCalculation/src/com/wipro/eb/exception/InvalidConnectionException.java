package com.wipro.eb.exception;

public class InvalidConnectionException extends Exception{
	public InvalidConnectionException(String string) {
		super(string);
	}

	public String toString()
	{
		return("Invalid ConnectionType");
	}
}
