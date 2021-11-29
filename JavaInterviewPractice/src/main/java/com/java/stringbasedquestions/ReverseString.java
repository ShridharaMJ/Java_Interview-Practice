package com.java.stringbasedquestions;

public class ReverseString {

	public static String apply(String orginalstr) {

		String newString = "";
		for (int i = orginalstr.length() - 1; i >= 0; i--) {
			newString += orginalstr.charAt(i);
		}

		return newString;

	}

	public static String applyRecursion(String originalstr) {

		if (originalstr.length() == 1)
			return originalstr;
		else
			return originalstr.charAt(originalstr.length() - 1)
					+ applyRecursion(originalstr.substring(0, originalstr.length() - 1));

	}

	public static String applyUsingStringBufferString(String originalstr) {
		StringBuffer sb = new StringBuffer(originalstr);
		return String.valueOf(sb.reverse());
	}

	public static void main(String[] args) {

		//System.out.println(applyRecursion("TEST"));
		
		System.out.println(ClassDemo.s1);
	}

}
