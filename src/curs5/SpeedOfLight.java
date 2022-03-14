package curs5;

public class SpeedOfLight {
	
	//calculam distanta parcursa cu viteza luminii in 1000 zile

	
	//constanta
	public final int SPEED_OF_LIGHT = 300000;
	short days;
	
	public SpeedOfLight(int days) {
		this.days = days;
	}
	
	
	public static void main(String[] args) {
		
		SpeedOfLight speed = new SpeedOfLight((short) 365);
		speed.calculateDistance();
		
	}

	public int calculateSecondsFromDays() {
		int seconds = days*24*60*60;
		return seconds;
	}
	
	 public void calculateDistance() {
		 int distance;
		 distance = SPEED_OF_LIGHT * calculateSecondsFromDays();
		 
		 System.out.println("Distanta parcursa este de :" + distance);
	 }
}
