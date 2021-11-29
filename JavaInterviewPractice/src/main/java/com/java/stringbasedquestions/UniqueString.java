package com.java.stringbasedquestions;

import java.util.HashSet;

public class UniqueString {

	public static boolean verifyUSingHashSet(String str) {
		str = str.trim();
		HashSet<Character> hs = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			hs.add(str.charAt(i));
		}

		return str.length() == hs.size();
	}

	public static boolean usingStringMethods(String str) {
		str = str.trim();
		for (int i = 0; i < str.length(); i++) {
			char charAtStr = str.charAt(i);
			if (str.indexOf(charAtStr) != str.lastIndexOf(charAtStr)) {
				return false;
			}
		}

		return true;

	}

	public static void main(String[] args) {

		//System.out.println(usingStringMethods("1231"));
		
		ClassDemo.s1="Specialist";
		System.out.println(ClassDemo.s1);
		

	}

}
