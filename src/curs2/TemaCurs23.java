package curs2;

import java.util.Scanner;

public class TemaCurs23 {

	public static void main(String[] args) {
		

		
	    System.out.println("Introdu un numar");
	    
		Scanner scan = new Scanner(System.in);
		int numar = scan.nextInt();
		
		String ziuaSaptamanii = "";
	
		switch (numar)  {
		
			case 1:
				ziuaSaptamanii = "Monday";
				break;
			case 2:
				ziuaSaptamanii = "Tuesday";
				break;
			case 3:
				ziuaSaptamanii = "Wednesday";
				break;
			case 4:
				ziuaSaptamanii = "Thursday";
				break;
			case 5:
				ziuaSaptamanii = "Friday";
				break;
			case 6: 
				ziuaSaptamanii = "Saturday";
				break;
			case 7:
				ziuaSaptamanii = "Sunday";
				break;
				
			default:
				System.out.println("Te rugam sa introduci un numar intre 1 si 7");		
		} 
		
		if (!ziuaSaptamanii.isBlank()) {
			
			System.out.println("Ziua saptamanii este:" + ziuaSaptamanii );
		}
		
	}
		
		
		
		
		
	}
		
