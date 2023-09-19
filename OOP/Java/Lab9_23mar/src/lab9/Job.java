package lab9;

public class Job extends FileProcessor{
	private double salary;
	 String roll;
	private int jobID;
	
	public Job(double salary, String roll, int jobID) {
		
		this.salary = salary;
		this.jobID = jobID;
		
		
		if(Run(roll)==true)
		{
				this.roll = roll;
		}
		
		else {
			this.roll="empty";
		}
		
	}



	public String toString() {
		return("Salary: " + salary + " Roll: " + roll + " JobID: " + jobID);
	}



	

	
	

}
