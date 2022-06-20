package curs8;

public class TestTextFileProcessor {

	public static void main(String[] args) {
		
		TextFileProcessor txtFile = new TextFileProcessor();
		txtFile.writeToFile("Noul text din fisier!");
		
		txtFile.readFile();
		txtFile.deleteFile();
	}

}
