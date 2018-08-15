package com.java.array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 1, 4, 3, 5, 5, 6, 7, 6, 6, 10, 8, 9, 10 };
		int[] noDuplicates = DistinctArray(arr);
		for(int i:noDuplicates){
			System.out.print(i+" ");
		}
	}

	private static int[] DistinctArray(int[] arr) {
		Set<Integer> mySet = new HashSet<Integer>();
		for (int i = 0; i < arr.length; i++) {
			mySet.add(arr[i]);
		}
		int[] arr1 = new int[mySet.size()];
		int k = 0;
		for (int i : mySet) {
			
			arr1[k++] = i;
		}
		return arr1;
	}
}
