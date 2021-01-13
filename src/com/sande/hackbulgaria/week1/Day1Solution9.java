package com.sande.hackbulgaria.week1;

public class Day1Solution9 {

	public long getLargestPalindrome(long n) {

		while (isPalindrome((int) n) == false) {
			n--;
		}
		return n;
	}

	public boolean isPalindrome(int n) {
		int originalN = n;
		int reversedN = 0;
		while (n > 0) {
			int remainder = n % 10;
			reversedN = reversedN * 10 + remainder;
			n = n / 10;
		}
		return originalN == reversedN;

	}

}
