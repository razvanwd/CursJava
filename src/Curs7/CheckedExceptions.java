package Curs7;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedExceptions {

	public static void main(String[] args) {
		
		try {
			Scanner scan = new Scanner(new File("test.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
		
			
			e.printStackTrace();
			
			System.out.println("Error!");
			
			
		}
	}

}
