package com.java.Features.java4n5;

import java.util.ArrayList;

/**
 * 
 * For each loop used to traverse array or collection elements.
 * Syntax: for(data_type variable : array | collection){}  
 */
public class ForEachLoop {
	public static void main(String[] args) {
		int arr[]={5, 8, 16, 24};
		
		for (int i:arr){
			System.out.println(i);
		}
		
		 ArrayList<String> list=new ArrayList<String>();  
		   list.add("Abdul");  
		   list.add("Prasad");  
		   list.add("Priya");  
		  
		   for(String s:list){  
		     System.out.println(s);  
		   }  
	}
}
