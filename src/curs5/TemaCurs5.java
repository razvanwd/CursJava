package curs5;

import java.util.Scanner;


public class TemaCurs5 {

	public static void main(String[] args){
		
//referinta catre obiect  //new String[12] obiectul.
		
	String[] lunileAnului = new String[12];
		
	lunileAnului[0] = "Ianuarie";
	lunileAnului[1] = "Februarie"; 
	lunileAnului[2] = "Martie"; 
	lunileAnului[3] = "Aprilie"; 
	lunileAnului[4] = "Mai"; 
	lunileAnului[5] = "Iunie"; 
	lunileAnului[6] = "Iulie"; 
	lunileAnului[7] = "August"; 
	lunileAnului[8] = "Septembrie"; 
	lunileAnului[9] = "Octombrie"; 
	lunileAnului[10] = "Noiembrie"; 	
	lunileAnului[11] = "Decembrie"; 	
		
		
	Scanner scan = new Scanner(System.in);

	System.out.println("Introduceti numarul lunii ");
		
	int numar = scan.nextInt() - 1;
		

		
	boolean executa = true;
	
	while (executa) {
		
		if (numar >= 1 && numar <=11) {
			
			
			System.out.println("Ati ales luna " + lunileAnului[numar]);
			executa = false;
		} else {
			System.out.println("Introduceti numarul lunii ");
			
			numar = scan.nextInt() - 1;
				
		}
	}

	
	}
}
