package com.ayseozcan;
import java.lang.Math;


public class Exercise1 {
	
	/*First, compute the respective powers of two floating-point variables x and y.
	Then Add them after taking powers.
	Then, compute the absolute value of floating-point z.
	Subtract this from the above-computed addition value.
	Now take Cube Root of the answer.
	Use inbuilt functions to calculate this expression */

	public static double exerciseOne (double x, double y, double z) {
		
		double answer = 0;
		
		double num1 = Math.pow(x, 2);
		double num2 = Math.pow(y, 2);
		double toplam = (num1 + num2);
		
		double num3 = Math.abs(z); 
		
		double newToplam = (toplam - num3);
		answer = Math.cbrt(newToplam);
		
		
		return answer;
		
		
	}
	public static void main(String[] args) {
		
		System.out.println(exerciseOne (3, 2, 4));
		
		
	}

}
