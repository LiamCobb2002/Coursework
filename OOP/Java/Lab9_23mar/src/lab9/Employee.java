package lab9;
import java.util.Date;

public class Employee extends Person{
	
	private String job; 
	private int  personnelNumber;
	private String startDate;
	private int nextNumber;
	
	public Employee(String firstName, String surName, String dateOfBirth, String gender, String job, int personnelNumber,
			String startDate, int nextNumber) {
		super(firstName, surName, dateOfBirth, gender);
		this.job = job;
		this.personnelNumber = personnelNumber;
		this.startDate = startDate;
		this.nextNumber = nextNumber;
	}
	
	
	
	public String toString() {
		return("Job: " + job + " Num: " + personnelNumber + " Start date: " + startDate + " next number: " + nextNumber);
	}

}
