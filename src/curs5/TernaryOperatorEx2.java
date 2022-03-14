package curs5;

import java.util.Scanner;

public class TernaryOperatorEx2 {
	
	/**
	 * Citeste 2 numere
	 * verifica daca fiecare este pozitiv
	 * verifica daca ambele sunt pozitive
	 * 	verifica care este cel mai mic nr
	 * 
	 * 
	 */

	 

	public static void main(String[] args) {

		 int num1;
		 int num2;
		 
		 Scanner scan = new Scanner(System.in);
		 
		System.out.println("Enter the fisrt number: ");
		num1 = scan.nextInt();
		
		System.out.println("Enter the second number: ");
		num2 = scan.nextInt();
		
		String answer;
		
		//verifica daca este pozitiv
		if(num1>0) {
			System.out.println("Num1 is positive");
		} else {
			System.out.println("Num 1 is negative");
		}
		
		//cazul2 cu operator ternar
		
		answer = num1>0 ? "Num1 is positive" : "Num1 is negative";
		System.out.println(answer);
	
	
	if (num1 >0 && num2>0) {
		System.out.println("Both are positive");
	} else {
		System.out.println("One is negative");
	}

		answer = (num1>0)&&(num2>0)? "Both are positive" : "One is negative";
		System.out.println(answer);


	// verifica care este cel mai mic nr
	
	if(num1<num2) {
		System.out.println("Num1 is the smallest");
		
	
	} else if (num1 == num2) {
		System.out.println("Numbers are equal");
	} else {
		System.out.println("Num2 is the smallest");
	}
	
	answer = num1==num2?"numbers are qeuals" :num1<num2 ? "Num 1 is the smallest" : "Num 2 is the smallest";
}
}