package curs3tema;

public class Qualification extends Teacher {

	public Qualification (String course, int experienceYears, String schedule) {
		
		setCourse(course);
		setExperienceYears(experienceYears);
		setSchedule(schedule);
		
	}
	
	public void verify() {
		
		if(getCourse().equals("Java") && getExperienceYears() > 3 && getSchedule().equals("Afternoon")) {
			
			System.out.println("You qualify to teach at this school!");
			
			
		} else {
			
			System.out.println("You do not qualify!");
			
		
		}
		
		
		
	}
}

