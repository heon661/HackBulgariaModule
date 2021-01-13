package com.sande.hackbulgaria.week1;

public class Day1Solution2 {

	public boolean isPrimeNumber(int number) {

		for (int i = 2; i < number - 1; i++) {
			if (number % i == 0) {
				return false;
			}

		}
		return true;

	}
}
