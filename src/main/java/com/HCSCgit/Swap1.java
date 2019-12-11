package com.HCSCgit;

public class Swap1 {
	public static void main(String[] args) {
		swap(3, 5);
	}
	public static void swap(int a, int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println("I am from Swap1.java file");
		System.out.println(a);
		System.out.println(b);
	}
}
