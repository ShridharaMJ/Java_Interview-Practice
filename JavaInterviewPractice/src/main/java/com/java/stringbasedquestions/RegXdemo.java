package com.java.stringbasedquestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Stream;

public class RegXdemo {

	public static void main(String[] args) {

		String s = "This is Java Prpgramming, 999 percent shou*ld be good.";
		s=s.replaceAll("\\d", "");
		String[] split = s.split("\\b");
		long count = Stream.of(split).map(s1->s1.replaceAll("\\d", "")).filter(s2->s2.trim().length()>1).count();
		System.out.println(count);

		System.out.println(s);
		// String[] split = s.split(" ");

		int i = 0;
		Pattern compile = Pattern.compile("\\w+");
		Matcher matcher = compile.matcher(s);
		while (matcher.find()) {

			System.out.println("Found " + i);
			i++;
		}
	}

}
