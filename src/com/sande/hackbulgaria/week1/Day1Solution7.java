package com.sande.hackbulgaria.week1;

public class Day1Solution7 {

	public long kthFactorial(int k, int n) {
		long result = n;

		for (int i = 1; i <= k; i++) {
			long fact = 1;

			for (int j = 1; j <= result; j++) {
				fact = fact * j;

			}
			result = fact;

		}
		return result;
	}
}
