package com.sande.hackbulgaria.week1;

public class Day1Solution11 {

	public long pow(int base, int exp) {

		int multiplier = base;
		int result = 1;
		if (exp == 0)
			return 1;

		for (int i = 1; i <= exp; i++) {

			result = result * multiplier;

		}
			return result;

	}

}
