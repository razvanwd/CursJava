package curs3;

import java.util.Scanner;

public class WhileLoopExample {

	public static void main(String[] args) {


		System.out.println("Please enter a number");
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		scan.close();
		
		for(int i=1; i<=10; i++) { //for are 3 elemente
			
			System.out.println(number + "*" + i + " = " + number*i);
			
		}
		
		System.out.println("------------------------------------");
	
		int x =1;
		while(x<=10) { //while are tot 3 elemente dar sunt intre acolade adica in cazul asta x = 1 este primul element, 
						//test conditionul este intre paranteze, iar incrementarea este dedesubt
			
			System.out.println(number + "*" + x + " = " + number*x);
			x++;
			
		
	
		}
	}

}
