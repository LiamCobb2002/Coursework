package lab9;

public class Date {
	private int day;
	private int month; 
	private int year;
	
	
	
	
	public Date(int day, int month, int year) {
		
		this.day = day;
		this.month = month;
		this.year = year;
	}




	public String toString() {
		return ("Day: " + day + " Month: " + month + " Year: " + year);
		
	}

}
