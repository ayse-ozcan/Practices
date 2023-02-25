package com.ayseozcan;

public class Exercise2 {
	
	public static boolean exerciseTwo(boolean x, boolean y) {
		boolean answer;
		
		answer = !((!x ^ x) && y);
		
		System.out.println(answer);
		
		return answer;
		

	}
	
	public static void main (String[] args) {
		
		exerciseTwo(true, true);
		
	}

}

		