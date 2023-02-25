package com.ayseozcan;

public class Fibonacci {

	public static String test(int n) {

		String fib = " ";

		int num1 = 0;
		int num2 = 1;

		int toplam = 0;

		for (int i = 0; i < n; i++) {
			if (i <= 1) {
				toplam = i;
				fib += String.valueOf(toplam) + " ";

			} else {
				toplam = num1 + num2;
				num1 = num2;
				num2 = toplam;
				fib += String.valueOf(toplam) + " ";
			}
			System.out.print(toplam + " ");
		}

		return fib;
	}

	public static void main(String[] args) {

		test(6);
	}
}
