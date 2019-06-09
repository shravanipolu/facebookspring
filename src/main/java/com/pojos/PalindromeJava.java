package com.pojos;

public class PalindromeJava {

	public static void main(String[] args) {
		int n = 252;
		int temp;
		int r;
		int reverse = 0;
		temp = n;
		while (n > 0) {
			r = n % 10;
			reverse = (reverse * 10) + r;
			n = n / 10;
		}
		if (reverse == temp) {
			System.out.println(temp + "it is palindrome");
		} else {
			System.out.println(temp + "it is not palindrome");
		}
}
}