package curs2;

import java.util.Scanner;

public class TemaCurs21 {

	public static void main(String[] args) {
		

		
	    System.out.println("Te rog Introdu punctajul obtinut la test");
		Scanner scan = new Scanner(System.in);
		
		int punctajTest = scan.nextInt();
		
		if (punctajTest  >= 0 && punctajTest <= 65 )   {
			System.out.println("Ai picat. Mai incearca");
		
			
		} else { 
			
		System.out.println("Felicitari, Ai trecut");
		 
		}
	

	}
}

