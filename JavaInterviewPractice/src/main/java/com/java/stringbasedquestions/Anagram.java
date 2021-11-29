package com.java.stringbasedquestions;

import java.util.Arrays;

public class Anagram {

	public static boolean usingString(String word1, String word2) {

		if (word1.length() != word2.length())
			return false;
		for (int i = 0; i < word1.length(); i++) {
			char charAtWord1 = word1.charAt(i);
			int indexOfWord2 = word2.indexOf(charAtWord1);

			if (indexOfWord2 != -1) {
				word2 = word2.substring(0, indexOfWord2) + word2.substring(indexOfWord2 + 1, word2.length());

			} else
				return false;

		}

		return word2.isEmpty();

	}

	public static boolean usingArrays(String word1, String word2) {

		if (word1.length() != word2.length())
			return false;

		char[] charArray1 = word1.toCharArray();
		char[] charArray2 = word2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		boolean equals = Arrays.equals(charArray2, charArray1);

		return equals ? true : false;

	}

	public static void main(String[] args) {
		//System.out.println(usingArrays("Angele", "Anglek"));
//ClassDemo.s1="QA";
		ClassDemo.changeValues();
		System.out.println(ClassDemo.s1);
	}

}
