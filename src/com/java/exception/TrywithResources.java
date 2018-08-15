package com.java.exception;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class TrywithResources {
	public static void main(String[] args)  {
		
		try (FileInputStream input = new FileInputStream("C:\\Users\\alokray\\Desktop\\Java\\ArrayPrograms.txt");
				BufferedInputStream bufferedInput = new BufferedInputStream(input)) {

			int data = bufferedInput.read();
			while (data != -1) {
				System.out.print((char) data);
				data = bufferedInput.read();
			}
		} 
		catch(FileNotFoundException e) {
		    e.printStackTrace();
		}
		catch(IOException|NullPointerException   ie){
			System.out.println("Inside IO Exeption");
			  ie.printStackTrace();
		}
	}
}
