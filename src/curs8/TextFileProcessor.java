package curs8;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileProcessor {
	
	public void writeToFile(String text) {
		
		try {
			FileWriter myWriter = new FileWriter("filename.txt");
			myWriter.write(text);
			myWriter.close();
			System.out.println("Successfully wrote to file!");
			
		} catch (IOException e) {
			
			System.out.println("An error has occured!");
			e.printStackTrace();
		} 
		
	}
	
	public void readFile() {
		
		File file = new File("filename.txt");
		try {
			Scanner scan = new Scanner(file);
			while(scan.hasNextLine()) {
				System.out.println(scan.nextLine());
			}
		} catch (IOException e) {
			
			System.out.println("An error has occured!");
			e.printStackTrace();

	}

}
	
		public void deleteFile() {
			
			File myFile = new File("filename.txt");
			myFile.delete();
			System.out.println("Deleted File " + myFile.getName() );
		} 
}