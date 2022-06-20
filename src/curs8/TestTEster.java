package curs8;

public class TestTEster {

	public static void main(String[] args) {

		Tester t1 = new Tester(23); // "23" --> este data type STring
		t1.printAge();
		
		Tester t2 = new Tester(24.6);  // 24.6 este data type double
		t2.printAge();
		
		Tester t3 = new Tester(23); // 23 este data type Integer
		t3.printAge();
	}

}
