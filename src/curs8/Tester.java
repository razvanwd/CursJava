package curs8;

public class Tester<T> {

	T age;
	
	public Tester(T age) {
		this.age=age;
		
	}
	
	public void printAge() {
		System.out.println("Valoarea lui age este: " + this.age);
	}
}
