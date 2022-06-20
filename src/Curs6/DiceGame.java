package Curs6;

import java.util.Scanner;

public class DiceGame {

	/**
	 * facem un joc de zaruri care are urmatorele reguli:
	 * daca userul da in total : 2, 6, 12, Pierde
	 * daca userul da in total: 7, 11 Castiga
	 * daca userul da in total : 3, 10,  Repeta
	 * daca da oricare dintre celelalte numere, il intrebam daca mai daca mai da o data
	 * 
	 */
	
	public static void main(String[] args) {
		
		boolean condition = true;
		
		while(condition) {
			
			int dice1 = (int) (Math.random()*6+1);
			int dice2 = (int) (Math.random()*6+1);
			int sum = dice1+dice2;
		
			System.out.println("Ai dat :" + sum);
			
			if (sum == 2 || sum == 6 || sum == 12) {
				System.out.println("Imi pare rau ai dat :" + sum + "! ai pierdut partida");
				break;
				
			} else if(sum == 7 || sum ==11) { 
				
				System.out.println("Ai dat :" + sum + " Ai castigat!");
			} else if(sum == 3 || sum ==10) {
				System.out.println("Ai dat :" + sum + "Automat mai dai o data !!");
				continue;
			}
				
			System.out.println("Mai dai o data?");
			Scanner scan = new Scanner(System.in);
			condition = scan.nextBoolean();
	
		}
	}

}
