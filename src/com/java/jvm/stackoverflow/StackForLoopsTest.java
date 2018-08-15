package com.java.jvm.stackoverflow;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class StackForLoopsTest {
	

	@Test
	public void listReversals() {

		final List<Integer> givenlist = Arrays.asList(1, 2, 3, 4, 5);
		final List<Integer> expected = Arrays.asList(5, 4, 3, 2, 1);
		long start = System.currentTimeMillis();
		assertEquals(expected.size(), StackForLoops.reverseRecursive(givenlist).size());
		long end = System.currentTimeMillis();
		System.out.println("reverseRecursive takes " + (end - start) + "ms");
		assertEquals(expected.size(), StackForLoops.reverseIterative(givenlist).size());
	}

}
