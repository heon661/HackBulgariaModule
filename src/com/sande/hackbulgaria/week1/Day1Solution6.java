package com.sande.hackbulgaria.week1;

public class Day1Solution6 {

	public long factorial(int n) {

		long fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public long doubleFactorial(int n) {

		return factorial((int) factorial(n));
	}
}
