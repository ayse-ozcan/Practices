package com.ayseozcan;
import java.lang.String;
public class StringDeneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String text = "  Hello Ayse!   ";
		String answer = " ";
		answer = text.trim();
		answer = answer.substring(0, 6);
		answer = answer.toUpperCase();
		
		System.out.println(answer);
	}

}
