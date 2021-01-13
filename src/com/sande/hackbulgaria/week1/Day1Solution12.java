package com.sande.hackbulgaria.week1;

public class Day1Solution12 {

	public int getOddOccurrence(int[] array) throws Exception {

		for (int i = 0; i < array.length; i++) {
			int count = 0;
			for (int j = 0; j < array.length; j++) {
				if (array[i] == array[j])
					count++;
			}
			if (count % 2 != 0)
				return array[i];
		}
		throw new Exception("Wrong imput");

	}

}
