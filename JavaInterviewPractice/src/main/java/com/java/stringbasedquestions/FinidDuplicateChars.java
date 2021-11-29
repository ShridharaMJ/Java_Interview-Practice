package com.java.stringbasedquestions;

import java.util.HashMap;
import java.util.Set;

public class FinidDuplicateChars {

	public static void findDuplicateCarsByHashmap(String str) {
		HashMap<Character, Integer> hsref = new HashMap<Character, Integer>();
		char[] strCharArray = str.toCharArray();
		for (char c : strCharArray) {
			if (hsref.containsKey(c))
				hsref.put(c, hsref.get(c) + 1);
			else
				hsref.put(c, 1);
		}

		Set<Character> keySet = hsref.keySet();
		for (Character character : keySet) {
			if (hsref.get(character) >1)
				System.out.println(character + " " + hsref.get(character));

		}

	}

	public static void main(String[] args) {
		findDuplicateCarsByHashmap("aaaabbbbggggttj");
	}
}
