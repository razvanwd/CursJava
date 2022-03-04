package curs4;

public class Rectangle {
	
	 //variabile
	//private inseamna ca sunt disponibile doar in interiorul clasei in care se afla 
	
	private int length;
	private int width;
	
	//constructorul default pe care daca nu il scriem il scrie JAVA:
	//are aceeasi sintaxa ca o metoda in afara de return type
	public Rectangle() {}
	
//constructor cu parametrii 
	public Rectangle(int num1, int num2) {
		setLength(num1); // method call
		setWidth(num2);
		
		
	}
	
	
	//getter - metode specifica care returneaza valoare unei variabile privata
	public int getLength() {
		return length;
	}
	//setter -  metode specifica care seteaza valoare unei variabile privata
	public void setLength(int length) {
		this.length = length;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	//metoda java  are un accessmodifier(public) are un returnType(void) are un numeMetoda adica calculeazaAaria(aici se afla parametrii metodei) { aici se afla logica metodei}
	//void -> inseamna ca nu retureneaza nimic
	// metoda asta va fi chemanta numeObj.calculeazaAaria(); - type este obiect
	
	public void calculeazaAria() {
		
		
		System.out.println( "Aria este" + length * width);
		
	}
	
	//metoda java
	//return int
	// metoda asta va fi chemanta numeObj.calculeazaPerimetru(); - type este int
	//la executie numeObj.calculeazaPerimetru() == (2*length) + (2*width) == 8
	public int calculeazaPerimetru() {
		
		return(2*length) + (2*width);
	}
	
	public String nume() {
		return "Ceva";
	}
	

}
