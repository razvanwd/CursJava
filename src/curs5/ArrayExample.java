package curs5;

public class ArrayExample {

	public static void main(String[] args) {

		String[] primulArray = {"unu", "doi", "trei"};
		
		String[] textArray = new String[5];
		textArray[0] = "This";
		textArray[1] = " is";
		textArray[2] = " an";
		textArray[3] = " array";
		textArray[4] = "!";
		
		
		//System.out.println(primulArray[2]);
		
		try {
			System.out.println(textArray[5]);
		} catch (Exception e) {
			
			//System.out.println("Ai incercat sa printezi in afara arrayului");
		}
		System.out.println(textArray[4]);
		
		for(int i =0; i<textArray.length; i++) {
			System.out.print(textArray[i]);
		}
	} 

}
