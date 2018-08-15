package com.java.string;

public class StringArrayCopy {
	public static void main(String[] args) {
		/*String[] array={"Ram","Hari","Ramesh","Sadashiva"};
		long startTime = System.nanoTime();
		System.out.println(makeSentence(array));
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");*/
		String str="Ramesha";
		System.out.println(isUniqueChars2(str));
		
	}

	public static String makeSentence(String[] words) {
		
		StringBuffer sentence = new StringBuffer();
		for (String w : words)
			sentence.append(w);
		return sentence.toString();
	}
	public static boolean isUniqueChars2(String str) {
		 boolean[] char_set = new boolean[256];
		 for (int i = 0; i < str.length(); i++) {
		 int val = str.charAt(i);
		 if (char_set[val]) return false;
		 char_set[val] = true;
		 }
		return true;
	}
}
class Students{
	 private Students(){
		
	}
}
