package com.lti;

public class Calc {

	public static int add(int a, int b) {
		return a + b;
	}
	public static int diff(int a, int b) {
		return a - b;
	}
	public static int prod(int a, int b) {
		return a*b;
	}
	public static int div(int a, int b) {
		return a/b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Sum is :"+add(55, 45));
		System.out.println("Difference is :"+diff(55, 45));
		System.out.println("Product is :"+prod(5, 4));
		System.out.println("Quotient is :"+div(50, 2));
	}

}
