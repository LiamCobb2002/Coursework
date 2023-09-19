package Lab4;

public class HourlyEmployee extends Employee{
	
	private double hoursWorked;
	private double hourlyRate;
	
	
	public HourlyEmployee(String firstName, String surName, int staffNumber, double annualSalary, double hoursWorked,
			double hourlyRate) {
		super(firstName, surName, staffNumber, annualSalary);
		this.hoursWorked = hoursWorked;
		this.hourlyRate = hourlyRate;
	}
	
	public String calculatePay() {
		double pay = hoursWorked*hourlyRate;
		String s= "\nAnual salary is: " +pay;
		return s;
					
	}
	
	public String toString() {
		String s ="Name: " + firstName + 
				"\nSurname: " + surName +
				"\nStaff number: " + staffNumber + 
				"\nSalary: " + annualSalary +
				"\nHours worked: " + hoursWorked +
				"\nHourly rate: " + hourlyRate
				;
		return s;
	}
	
	
	
	
	
	

}
