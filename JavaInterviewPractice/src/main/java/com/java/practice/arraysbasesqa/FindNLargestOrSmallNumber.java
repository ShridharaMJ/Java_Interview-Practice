package com.java.practice.arraysbasesqa;

import java.util.Arrays;
import java.util.Collections;

public class FindNLargestOrSmallNumber {

	public static int getNumber(int[] arr, String typeOfNumnber, int index) {
		if (typeOfNumnber.toLowerCase().contains("small")) {
			Arrays.sort(arr);
		}
		else if(typeOfNumnber.toLowerCase().contains("large"))
			Arrays.sort(arr);

		return arr[index];
	}

	public static void main(String[] args) {
 
	}

}
