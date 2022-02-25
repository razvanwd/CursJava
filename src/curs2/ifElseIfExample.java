package curs2;

import java.util.Scanner;

public class ifElseIfExample {
	
	public static void main(String[] args) {
		
		//Intrebam Punctajul unui test si atribuim un calificativ
		
		//daca a obitnut <= 90  --> B
		//daca a obtinut <= 80 --> C
		//daca a obtinut <= 70 --> D
		//daca a obtinut <= 60 --> E
		//daca are >90 --> A
		
		
		System.out.println("Ce puncaj ai obtinut ?");
		Scanner scan = new Scanner(System.in);
		int punctaj = scan.nextInt();
		
		char calificativ;
		
		if(punctaj <=60) {
			
			calificativ ='E';
					
		} else if (punctaj <=70) {
			calificativ = 'D';
		}else if (punctaj <=80) {
			
			calificativ = 'C'; }
		
			else if (punctaj<=90) {
				calificativ = 'B';
			} else {
				calificativ = 'A';
			}
		
		

		
		System.out.println("Calificativul primit este :" + calificativ);
		
	}

}
