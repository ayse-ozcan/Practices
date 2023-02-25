package com.ayseozcan;
import java.lang.String;
public class StringChallenge {
	
	public static String sc(String text) {
		
		String newText = "  Hello Ayse!   ";
		String answer = " ";
		answer = newText.trim();
		answer = answer.substring(0, 6);
		answer = answer.toUpperCase();
		
		return answer;
		
	}
	
	public static void main(String[] args) {
		
		System.out.println(sc(" "));
		
		
		
	}

}
