package curs2;

public class ParSauImpar {
	
	public static void main(String[] args) {
		
		int number = 3;
		
		if(number % 2 == 0) {
			
			System.out.println( number + " este par!");
			
		} else {
			System.out.println( number + " este impar!");
		}
		
		ParSauImpar obiect = new ParSauImpar();
		obiect.verificaParSauImpar(4);
		
		}
	
	public void verificaParSauImpar(int number) {
		//int number = 3;
		
		if(number % 2 == 0) {	
			System.out.println( number + " este par!");
		} else {
			System.out.println( number + " este impar!");
		}
	}
	}


