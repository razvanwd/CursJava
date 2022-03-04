package curs4;

public class TestOveride {

	public static void main(String[] args) {

		Angajat angajat = new Angajat();
		angajat.work();
		
		Tester tester = new Tester();
		tester.work();
		tester.scrieTeste();
		
		Developer developer = new Developer();
		developer.work();

		Angajat tester2 = new Tester();
		tester2.work();
		((Tester) tester2).scrieTeste();
		
		Angajat tester3 = new Tester();
		tester3.work();
		
		tester3 = new Developer();
		tester3.work();
			
		//WebDriver obiect = new ChromeDriver();
		//numeClasa numeObiect = new constructorulClasei();
	}

}
