package com.java.basic;

import java.util.Collection;
import java.util.Collections;

public class ExceptionCheck {
	public static void main(String[] args) throws MyException {
		//throw new MyException("MyException");
		try{
			throw new LaluException("LaluException");
		}
		catch(LaluException e){}
		catch(Exception e){}
		
	}
}


class LaluException extends MyException{

	LaluException(String Error) {
		super(Error);
		
	}
	
}

class MyException extends Exception{
	
	MyException(String Error){
		super(Error);
		//System.out.println("My Exception Happended"+Error);
	}
}