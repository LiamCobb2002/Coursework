package lab9;

public class Control {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d = new Date(1,1,2002);
		System.out.println(d.toString());
		
		Job j = new Job(10000,"Doctor", 101);
		System.out.println(j.toString());
		
		FileProcessor f = new FileProcessor();
		
		
		Person p = new Person("bob","jones", "10/10/2002", "male");
		System.out.println(p.toString());
		
		Employee e= new Employee("bob","jones", "10/10/2002", "male", "doctor", 111, "211/1/2003", 1);
		System.out.println(e.toString());

	}

	

}
