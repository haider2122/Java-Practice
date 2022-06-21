package oopsEmployee;

public class Employee {

	private String firstName;
	private String lastName;
	private double salary;
	
	
	
	public Employee() {
		super();
	}
	
	
	
	public Employee(String firstName, String lastName, double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		if(this.salary<0){
			this.salary=0.00;
		}
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	public void increaseSal(int val){
		double percent_increase=((double)(100+val)/(double)100);
		
		this.salary=(double)this.salary* ((double)percent_increase);
		
	}



	@Override
	public String toString() {
		if(this.salary<0){
			this.salary=0.00;
		}
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary + "]";
	}
	
	
	
}
