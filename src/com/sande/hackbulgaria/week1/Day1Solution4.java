package com.sande.hackbulgaria.week1;

public class Day1Solution4 {

	public int kthMinElement(int k, int array[]) {

		for (int i = 0; i < array.length - 1; i++) {
			for (int j = 0; j < array.length - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					int buffer = array[j];
					array[j] = array[j + 1];
					array[j + 1] = buffer;
				}
			}

		}
		return array[k-1];

	}
}
