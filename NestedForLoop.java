package com.ayseozcan;

public class NestedForLoop {

	public static void main(String[] args) {
		int input = 5;

        System.out.println("How many missiles will you fire?");
        System.out.println("I will fire: " + input + " missiles");

        for (int i = 0; i < input; i++) { // outer for loop
            for (int j = 3; j > 0; j--) { // inner for loop // tum kosullar tamamlanana kadar devam ediyor. 
            												// tamamlaninca distaki for a geciyor sonra tekrar inner ve tekrar 
            												// inner daki kosullarin hepsini bitiriyor sonra tekrar distaki for a
                System.out.println(j + " ");
            }
            System.out.println("Missile " + (i + 1) + " has launched.");
        }

        System.out.println("All missiles have been launched.");

	}

}
