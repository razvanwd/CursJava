package curs1;

public class ExampleVariables {

	String Prenume = "Oana";//instance variable - am nevoie de un obiect al clasei pentru a o accesa
	
	static String greetings = "Numele Meu este : ";//varibila statica - poate fi chemata fara o instanta a clasei
	
	//metoda main - metoda principala de executie
	public static void main(String[] args) {
		
		// obiectul clasei care imi permite sa accesez variabilele si metodele din clasa respectiva 
		ExampleVariables numeObiect = new ExampleVariables();
		
		
		//System.out.println(numeObiect.Prenume);
		
		//numeObiect.printNume();
		//System.out.println(greetings);
		
		System.out.println(greetings + numeObiect.printNume());
	}
	
	public String printNume() {
		String nume = "Ion ";//local variable
		return nume + Prenume;
	}
}

