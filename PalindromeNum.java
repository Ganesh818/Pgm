package com.first.java;

public class PalindromeNum {

	public static void main(String[] args) {
		
	palindrome(16161);
		
		
	}
public static void palindrome(int num) {
	
	
	int temp=num;

	int reverse = 0;

	for (; num > 0;) {
		int rem = num % 10;

		reverse = reverse * 10 + rem;
		
		num = num/10;

	}
	
	if (reverse==temp) {
		System.out.println("Number is palindrome");
	}else
		
		System.out.println("number isn't palindrome");
	
	
}
}