package curs2;

import java.util.Scanner;

public class temacurs22 {

	public static void main(String[] args) {
		

		
	    System.out.println("Ce varsta aveti?");
		Scanner scan = new Scanner(System.in);
		
		int varsta = scan.nextInt();
		
		if (varsta <18)   {
			System.out.println("Esti minor");
		
			
		} else if  (varsta >= 18 && varsta <= 65) {
			System.out.println("Esti Adult"); }
		
		else if (varsta > 65) {
			System.out.println("Esti Batran");
		}
		
		

	}
}

