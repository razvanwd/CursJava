package Curs6;

public class Temacurs62 {

	public static void main(String[] args) {
		
		String text = "Eu Invat Java";
		
		int total = 0;
	
		for(int i=0; i<text.length(); i++) {
			
			if (text.charAt(i) == 'A' || text.charAt(i) == 'a') {
				
				total = total +1;
				
			} else if(text.charAt(i) == 'E' || text.charAt(i) == 'e') {
				
				total = total +1;
			} else if(text.charAt(i) == 'I' || text.charAt(i) == 'i') {
				total = total +1;
			
			} else if(text.charAt(i) == 'O' || text.charAt(i) == 'o') {
				total = total +1;
		    } else if(text.charAt(i) == 'U' || text.charAt(i) == 'u')
		    	total = total +1;
				
		}
		
		System.out.println("Numarul total de vocale din propozitie este: " + total);

	}

}
