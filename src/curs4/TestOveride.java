package curs4;

public class TestOveride {

	public static void main(String[] args) {

		Angajat angajat = new Angajat();
		angajat.work();
		
		//tester are acces la tot ce este in Tester
		Tester tester = new Tester();
		tester.work();
		tester.scrieTeste();
		
		Developer developer = new Developer();
		developer.work();

		//tester 2 are acces la tot ce este in Angajat
		
		Angajat tester2 = new Tester();
		tester2.work();
		//s-a facut un cast, ca sa aiba acces la ce este in Tester
		((Tester) tester2).scrieTeste();
		
		Angajat tester3 = new Tester();
		tester3.work();
		
		tester3 = new Developer();
		tester3.work();
			
		//WebDriver obiect = new ChromeDriver();
		//numeClasa numeObiect = new constructorulClasei();
		
		// Clasa -> metoda care are un return type --> new AltaClasa 
		// HomePage.class -> navigateToContactPage() {return new ContactPage.class}
		// ContactPage contactPage = navigateToContactPage
	}

}
