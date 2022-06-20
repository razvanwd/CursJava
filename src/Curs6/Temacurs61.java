package Curs6;

import java.util.Scanner;

public class Temacurs61 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		Scanner scan = new Scanner(System.in);
		
		int[] arrayNumbers = new int[10];
				
		for (int i=0; i<arrayNumbers.length; i++) {
			
			int numar = i+1; // ca sa sa porneasca de la 1
			
			System.out.println("Introduceti numarul " + numar);
			
			int numarIntrodus = scan.nextInt();
			
			arrayNumbers[i] = numarIntrodus; // arraynumbers[i] face ce am facut in TemaCurs5
			
			sum = numarIntrodus + sum;
		
		}
		
		System.out.println("Suma numerelor introduse este " + sum );

	}

}
