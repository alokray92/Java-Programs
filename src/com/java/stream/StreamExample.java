package com.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd","", "jkl");
		List<String> filtered = strings.stream().filter(s->!s.isEmpty()).collect(Collectors.toList());
		System.out.println(filtered.toString());
		Random random = new Random();
		random.ints().limit(10).forEach(System.out::println);
	}
}
