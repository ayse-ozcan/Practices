package com.ayseozcan;

public class Multiplication {

	public static String test(int num) {
		int i = 1;
		String answer = "";
		int carpim;
		while (i <= 10) {
			carpim = num * i;
			answer += String.valueOf(carpim) + " ";
			i++;
		}
		return answer;
	}

	public static void main(String args[]) {
		System.out.println(test(5));
	}
}
