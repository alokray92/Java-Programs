package com.java.array;

public class MissingNum {
	public static void main(String[] args) {
		int n = 10;
		int[] arr = new int[] { 1, 2, 3, 4, 5, 7, 8, 9, 10 };
		int findNum = findMissing(arr, n);
		System.out.println(findNum);
	}

	private static int findMissing(int[] arr, int n) {
		int actualSum = 0, num = 0;
		int expectedSum =( n *(n + 1) )/ 2;
		for (int i : arr) {
			actualSum += i;
		}

		num = expectedSum - actualSum;
		return num;
	}

}
