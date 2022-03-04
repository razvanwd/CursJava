package curs4;

public class MethodOverload {

	public static void main(String[] args) {
		
		MethodOverload obj = new MethodOverload();
		
		System.out.println(obj.multiply(2.4, 4));

	}
	
	//method overload - 

public int multiply(int num1, int num2) {
	return num1 & num2;
	
	}
	public double multiply(double num1, double num2) {
		return num1 * num2;
	
		
	}	
	
}
