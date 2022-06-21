package oopsEmployee;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee emp1=new Employee("Jack","Gordan",1000);
		Employee emp2=new Employee("Jack","Gordan",1000);
		
		Employee emp3=new Employee("Jack","Gordan",-212);
		
		
		System.out.println(emp1);
		System.out.println(emp2);
		
		emp1.increaseSal(10);
		emp2.increaseSal(100);
		
		
		
		System.out.println("\n\n"+emp1);
		
		System.out.println(emp2);
	
		System.out.println(emp3.getSalary());
	}
}
