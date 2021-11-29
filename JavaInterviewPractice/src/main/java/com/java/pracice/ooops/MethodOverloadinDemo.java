package com.java.pracice.ooops;

public class MethodOverloadinDemo {

	public void m1(int i) {
		System.out.println("Printing value of int "+i);
		
	}
	public void m1(Integer i) {
		System.out.println("Printing value of Integer "+i);
		
	}
	
	public static void main(String[] args) {
	MethodOverloadinDemo ref = new MethodOverloadinDemo();
	ref.m1(Integer.valueOf(100));
	}
}
