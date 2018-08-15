package com.java.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DuplicateNumbers {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 1,4,3,  5, 6,7, 6, 10, 8, 9, 10 };
		 List<Integer> list =Arrays.stream(arr).boxed().collect(Collectors.toList()); 
		 list.forEach(result ->System.out.print(result + " "));
		 System.out.println();
		 Collections.sort(list);
		 list.forEach(result ->System.out.print(result + " "));
		 Set<Integer> set=new HashSet<Integer>();
		 
		 for(int i= 0 ; i < list.size()-1; i++){
			 if(list.get(i).equals(list.get(i+1))){
				 set.add(list.get(i));
			 }
		 }
		 System.out.println();
		 set.forEach(result ->System.out.print(result + " "));
	}
}
