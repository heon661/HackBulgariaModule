package com.sande.hackbulgaria.week1;

public class Day1Solution3 {

	public int findMinNumberInArray(int array[]) {
		int minNumber = array[0];

		for (int i = 0; i < array.length; i++) {
			if (minNumber > array[i]) {
				minNumber = array[i];

			}

		}

		return minNumber;
	}
}
