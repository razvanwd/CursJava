package Curs7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample {
	public static void main(String[] args) {
		
		//useless catch
		
		try {
			Scanner scan = new Scanner(System.in);
			System.out.println("Introdu un numar");
			int num1 = scan.nextInt();
			System.out.println("Introdu al 2lea nr");
			int num2 = scan.nextInt();
			num2 = (Integer) null;
			System.out.println(num1/num2);
			
		} catch(ArithmeticException e) {
			System.out.println("You should not divide by 0");
			
		} catch (InputMismatchException e) {
			
		System.out.println("Please insert only numeric values"); }
		
		catch (NullPointerException e) {
			System.out.println("Null Pointer occured");
			e.printStackTrace();
			
		} catch(Exception e) {
			System.out.println("Something went wrong!");
			
			
		} 
		
		System.out.println("Cod in afara try catch");
	}

}
