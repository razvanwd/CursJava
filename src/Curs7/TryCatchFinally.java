package Curs7;

public class TryCatchFinally {

	public static void main(String[] args) {


		try {
			
			String nume = null;
			System.out.println(nume.length());
			
			
		} catch(NullPointerException e) {
			System.out.println("Null pointer exception occured");
			
		} finally {
			System.out.println("Finally block of code");
		}

	}

}
