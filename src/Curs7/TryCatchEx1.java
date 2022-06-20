package Curs7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatchEx1 {

	public static void main(String[] args) {

		//useless catch
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Introdu un numar");
			int num1 = scan.nextInt();
			System.out.println("Introdu al 2lea nr");
			int num2 = scan.nextInt();
			System.out.println(num1/num2);
			
		} catch(InputMismatchException e) {
			System.out.println("Error!");
		}

	}

}
