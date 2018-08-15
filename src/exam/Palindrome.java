package exam;

import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.Scanner;
import java.util.TreeMap;

public class Palindrome {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = s.nextLine(); // Reading input from STDIN
		int t = Integer.parseInt(name);

		for (int i = 0; i < t; i++) {
			long input = s.nextLong();
			String sip = String.valueOf(input);
			String evenPal = evenLength(sip);
			char value = repeatDigit(evenPal);
			System.out.println(value);

		}

	}

	private static char repeatDigit(String evenPal) {
		char repeatnum = 0;
		char[] arr = evenPal.toCharArray();
		NavigableMap<Character, Integer> map = new TreeMap<Character, Integer>();

		for (int j = 0; j < evenPal.length(); j++) {
			char ch = arr[j];
			if (map.containsKey(arr[j])) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}

		}

		int maxValueInMap = (Collections.max(map.values()));
		for (Entry<Character, Integer> entry : map.entrySet()) {
			if (entry.getValue() == maxValueInMap) {
				if (repeatnum == 0)
					repeatnum = entry.getKey();
				
				if ((int) (entry.getKey()) < (int) (repeatnum)) {
						repeatnum = entry.getKey();
					}

			}
		}
		return repeatnum;
	}

	private static String evenLength(String sip) {

		String res = sip;
		for (int j = sip.length() - 1; j >= 0; --j)
			res += sip.charAt(j);

		return res;

	}
}
