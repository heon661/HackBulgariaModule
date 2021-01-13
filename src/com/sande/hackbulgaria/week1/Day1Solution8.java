package com.sande.hackbulgaria.week1;

public class Day1Solution8 {

	public long smallestMultiple(int upperBond) {
		int smallestNumber = upperBond;
		while (isMultipleNumber(smallestNumber,upperBond) == false) {
			smallestNumber++;
		}
		return smallestNumber;

	}

	private boolean isMultipleNumber(int n, int k) {

		for (int i = 2; i <= k; i++) {
			if (n % i != 0) {
				return false;
			}

		}
		return true;
	}
}
