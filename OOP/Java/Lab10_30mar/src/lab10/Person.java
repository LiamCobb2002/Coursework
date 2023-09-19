package lab10;

public class Person {
	private String fname;
	private String sname;
	private String city;
	
	public Person(String fname, String sname, String city) {
		super();
		this.fname = fname;
		this.sname = sname;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Person [fname=" + fname + ", sname=" + sname + ", city=" + city + "]";
	}
	
	
	
	
	
}
