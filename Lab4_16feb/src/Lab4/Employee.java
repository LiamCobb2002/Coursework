package Lab4;

public class Employee {
	
	protected String firstName;
	protected String surName;
	protected int staffNumber;
	protected double annualSalary;
	
	
	
	
	public Employee(String firstName, String surName, int staffNumber, double annualSalary) {
		
		this.firstName = firstName;
		this.surName = surName;
		this.staffNumber = staffNumber;
		this.annualSalary = annualSalary;
	}
	
	public String toString() {
		String s ="Name: " + firstName + 
				"\nSurname: " + surName + 
				"\nStaff number: " + staffNumber + 
				"\nSalary: " + annualSalary +
				calculatePay();
		return s;
	}
	
	public String calculatePay() {
		double pay = annualSalary/12;
		String s= "\nAnual salary is: " +pay;
		return s;
				
		
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public int getStaffNumber() {
		return staffNumber;
	}
	public void setStaffNumber(int staffNumber) {
		this.staffNumber = staffNumber;
	}
	public double getAnnualSalary() {
		return annualSalary;
	}
	public void setAnnualSalary(double annualSalary) {
		this.annualSalary = annualSalary;
	}
	
	

}
