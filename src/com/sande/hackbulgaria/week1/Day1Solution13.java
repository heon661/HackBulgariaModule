package com.sande.hackbulgaria.week1;

public class Day1Solution13 {
	
	public long maximalScalarSum(int[] vector1, int[] vector2) {
		
		int scalarSum = 0;
		for (int i = 0; i<vector1.length; i++) {
			scalarSum = scalarSum + (vector1[i]*vector2[i]);
			
		}
		return scalarSum;
	}
	
}
