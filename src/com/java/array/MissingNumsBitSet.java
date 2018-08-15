package com.java.array;

import java.util.BitSet;

public class MissingNumsBitSet {
	public static void main(String[] args) {

		// one missing number
		printMissingNumber(new int[] { 1, 2, 3, 4, 6, 7, 9, 8, 10 }, 10);
		System.out.println(" ");
		// three missing number
		printMissingNumber(new int[] { 1, 2, 3, 4, 6, 9, 8 }, 10);
		System.out.println(" ");
		// four missing number
		printMissingNumber(new int[] { 7, 1, 2, 3, 4, 9, 8 }, 10);

	}

	private static void printMissingNumber(int[] numbers, int count) {
		int missingCount = count - numbers.length;
		BitSet bset = new BitSet(count);
		for (int num : numbers) {
			bset.set(num - 1);
		}
		int lastMissingIndex = 0;
		for (int i = 0; i < missingCount; i++) {
			lastMissingIndex = bset.nextClearBit(lastMissingIndex);
			System.out.print(++lastMissingIndex + " ");
		}
	}

}
