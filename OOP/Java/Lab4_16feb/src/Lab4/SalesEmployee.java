package Lab4;

public class SalesEmployee extends Employee{
	 private double commissionEarned;

	 
	 
	public SalesEmployee(String firstName, String surName, int staffNumber, double annualSalary,
			double commissionEarned) {
		super(firstName, surName, staffNumber, annualSalary);
		this.commissionEarned = commissionEarned;
	}

	public String calculatePay() {
		double pay = annualSalary/12 + commissionEarned;
		String c="\nmonthly pay is: " +pay;
		return c;
				
	}			
	

}
