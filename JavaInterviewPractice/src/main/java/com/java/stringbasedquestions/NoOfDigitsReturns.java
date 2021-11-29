package com.java.stringbasedquestions;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

public class NoOfDigitsReturns {

	/*
	 * Complete the 'alternatingCharacters' function below.
	 *
	 * The function is expected to return an INTEGER. The function accepts STRING s
	 * as parameter.
	 */

	public static int alternatingCharacters(String s) {
		// Write your code here

		// AAA
		int count = 0;
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == 'A' && i+1 < chars.length) {
				if (!(chars[i + 1] == 'B'))
					count++;

			} else if (chars[i] == 'B' && i+1 < chars.length) {
				if (!(chars[i + 1] == 'A'))
					count++;

			}

		}
		return count;
	}

	@Test
	public void testCase2() {
		int alternatingCharacters = alternatingCharacters("AAA");
		System.out.println(alternatingCharacters);
	}

	@Test
	public void tescase1() {

		String s = "Testing";
		System.out.println(s.length());

		List<String> asList = Arrays.asList("Test", "Testq\n", "Testw", "Testw", "Teste", "Testr", "Testt");
		System.out.println(asList.size());

		// Normal iteration...
		for (int i = 0; i <= asList.size() - 1; i++) {
			System.out.println(asList.get(i));
		}

		// Reverse iteration

		System.out.println(".................Reverse iteration..............");

		for (int i = asList.size() - 1; i >= 0; i--) {
			System.out.println(asList.get(i));
		}

		String str = "This is for testing purpose ";
		String[] split = str.split("\\s");
		System.out.println(split.length);

	}
}
