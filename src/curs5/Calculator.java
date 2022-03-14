package curs5;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		calc.askTheUser();
		calc.calculateValues();
		calc.printResults();
	}
	private static final String Else = null;
	/**
	 * Calculator pentru operatiile de baza (+, -, *, /) cu 2 numere
	 * numerele sunt date de la tastatura
	 * la fel si operatiamatematica
	 * Printam operatia si rezultatul: Ex: 3 + 5 = 8
	 * 
	 */
	
	int num1;
	int num2;
	char calculus;
	int result;

		// aflam numerele si operatia
		public void askTheUser() {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Please enter first number: ");
					
			num1 = scan.nextInt();
			
			System.out.println("Please enter the calculus : " );
			
			calculus = scan.next().charAt(0);
			
			System.out.println("Please enter Second number: ");
			
			num2 = scan.nextInt();
		}
		
		// sa calculam
	
		public void calculateValues() {
			if(calculus == '+') {
			result = num1 + num2;
			}
			else if(calculus == '-') {
				
			
			result = num1 - num2;
		
			} else if (calculus == '*' || calculus == 'x') {
				result = num1 * num2;
				
			} else if (calculus == '/') {
				
				result = num1/num2;
			} else { 
				System.out.println("Wrong character!");
			}
			}
		
		
		
		// sa printam
		
	public void printResults() {
		System.out.println(num1 + " " + calculus + " " + num2 + " = " + result);
	}
	}

