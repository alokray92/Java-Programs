package com.java.array;

public class DuplicateNumber {
	public static void main(String[] args) {
		
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6,7, 10, 8, 9, 10 };
		int numOfElem=arr.length-1;
		int findNum = extraNum(arr, numOfElem);
		System.out.println(findNum);
	}

	private static int extraNum(int[] arr, int numOfElem) {
		int actualSum=(numOfElem*(numOfElem+1))/2;
		int sumOfElem=0;
		for (int i=0;i<arr.length;i++){
			sumOfElem+=arr[i];
		}
		
		return sumOfElem-actualSum;
	}
}
