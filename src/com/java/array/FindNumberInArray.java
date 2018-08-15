package com.java.array;

import java.util.Arrays;

public class FindNumberInArray {
	public static void main(String[] args) {
		int[] arr = new int[] { 2, 3, 1, 5, 4, 6, 7, 10, 8, 9 };
		int num = 7;
		findNum(arr, num);
		findNumSorting(arr, num);
		largestSmallestElement(arr);
	}

	private static void largestSmallestElement(int[] arr) {
		Arrays.sort(arr);
		System.out.println("Smallest Element "+arr[0]);
		System.out.println("Largest Element "+arr[arr.length-1]);
	}

	// Time Complexity of sequential search O(n)
	private static void findNum(int[] arr, int num) {
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == num) {
				System.out.println("Number " + num + " found at index " + i);
			}
		}

	}

	private static void findNumSorting(int[] arr, int num) {
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int search = Arrays.binarySearch(arr, num);
		System.out.println(search);
	}

}
