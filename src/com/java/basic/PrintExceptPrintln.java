package com.java.basic;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;

public class PrintExceptPrintln {

	public static void main(String[] args) throws IOException {
		
		System.out.write("Alok Kumar Samantaray \n".getBytes());
		
		System.out.format("%s", "Ama Kudia Member \n");
		
		PrintStream out=new PrintStream(new FileOutputStream(FileDescriptor.out)); 
		out.print("Listening to Wakhra swag ni \n");
		System.out.print((Object)null);
		System.err.print("\nCustom error message");
		
	}

}
