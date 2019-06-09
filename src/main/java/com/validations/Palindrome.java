package com.validations;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String reverse = "";
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter any string");
		String Original = scanner.nextLine();
		int length = Original.length();
		for (int i = length - 1; i >= 0; i--) {
			reverse = reverse + Original.charAt(i);
		}
		if (reverse.equals(Original)) {
			System.out.println("it is palindrome");
		} else {
			System.out.println("it is not palindrome");
		}
	}
}
	/*
	 * public static void main(String[] args) { int n = 252; int temp; int r;
	 * int reverse = 0; temp = n; while (n > 0) { r = n % 10; reverse = (reverse
	 * * 10) + r; n = n / 10; } if (reverse == temp) { System.out.println(temp +
	 * "it is palindrome"); } else { System.out.println(temp +
	 * "it is not palindrome"); } }
	 */

	/*
	 * public static void main(String[] args) { int n=252; int temp,r; int
	 * reverse=0; temp=n; for(int i=n;n>0;n=n/10){ r=n%10;
	 * reverse=(reverse*10)+r; } System.out.println(reverse); if(reverse==temp)
	 * System.out.println("it is palindrome");
	 * 
	 * }
	 */

		
		
		
		/*
	public static void main(String[] args) {
		  int a = 0;
		int b = 1;
		System.out.println(a);
		// System.out.println(b);
		int c=0;
		for (int i = 1; i < 100; i++) {
			if (c<=100) {
				c = a + b;
				b = a;
				a = c;
				System.out.println(c);
	}
			}
		 */	




