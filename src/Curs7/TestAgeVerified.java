package Curs7;

public class TestAgeVerified {

	public static void main(String[] args) {


		AgeVerifier ageCheck = new AgeVerifier();
		
		try {
			ageCheck.checkAgeLimit(5);
		} catch (MyCustomException e) {
			
			System.out.println("You must be 18 to vote");
			
			e.printStackTrace();
		}

	}

}
