package lab9;
import java.util.Date;

public class Person {
	
	private String firstName;
	private String surName;
	private String dateOfBirth;
	private String gender;
	
	
	
	public Person(String firstName, String surName, String string, String gender) {
		super();
		this.firstName = firstName;
		this.surName = surName;
		this.dateOfBirth = string;
		this.gender = gender;
	}



	public String toString() {
		return("Firstname: " + firstName + " Surname: " + surName+ " DOB: " + dateOfBirth + " Gender: " + gender);
	}
}
