package com.java.practice.arraysbasesqa;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class FindNLargestOrSmallNumber {

	public static int getNumber(Integer[] arr, String typeOfNumnber, int index) {
		
		if (typeOfNumnber.toLowerCase().contains("small")) {
			Arrays.sort(arr);
		} else if (typeOfNumnber.toLowerCase().contains("large")) {
			Arrays.sort(arr, Collections.reverseOrder());
		}

		return arr[index];
	}

	public static void main(String[] args) {

	}

}
