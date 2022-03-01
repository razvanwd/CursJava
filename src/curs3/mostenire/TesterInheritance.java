package curs3.mostenire;

public class TesterInheritance {

	public static void main(String[] args) {

		TesterAutomat tester = new TesterAutomat();
		
		tester.setProgrammingLanguage("Java"); // --> clasa TesterAutomat()
		tester.setDepartament("QA"); // -> clasa Tester()
		tester.setSeniority("Junior"); //-> clasa Tester()
		tester.setEmail("oana@apple.com"); // clasa Angajat()
		tester.setName("Oana"); // --> clasa Angajat()
		
		System.out.println("Numele angajatului este " + tester.getName() + ", face parte din departamentul " + tester.getDepartament() + " este de nivel " + tester.getSeniority());
	}

}
