package Curs6;

public class ForEachExample2 {
	
	public static void main(String[] args) {
		
		String[] cities = {"Iasi", "Alba", "Arad", "Cluj", "Timis"};
		
		for(String city : cities) {
			
			if(city.equals("Cluj")) {
				//break; ->> ma scoate din for
				continue; // --> face skip la conditie si continua forul
			}
			
			System.out.println(city);
			
		}
		
		
	}

}
