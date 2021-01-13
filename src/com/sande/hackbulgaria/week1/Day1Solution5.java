package com.sande.hackbulgaria.week1;

public class Day1Solution5 {

	public double getAverage(int array[]) {

		double summ = 0;
		for (int i = 0; i < array.length; i++) {
			summ = summ + array[i];

		}
		return summ / array.length;
	}

}
