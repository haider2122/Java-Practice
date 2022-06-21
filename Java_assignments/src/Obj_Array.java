
import java.util.*;
import java.util.Scanner;
class Emp implements Comparable<Emp>{
	
	int empno;
	String name;
	int sal;
	String dept;
	
	void setEmpno(int empno){
		this.empno=empno;
	}
	void setName(String name){
		this.name=name;
		
	}
	void setSal(int sal){
		this.sal=sal;
		
	}
	void setDept(String dept){
		this.dept=dept;
		
	}
	public String getName(){
		return this.name;
	}
	public int getEmpno(){
		return this.empno;
	}


	
	public int getSal(){
		return this.sal;
	}

	public String getDept(){
		return this.dept;
	}

	public String toString(){
		return this.empno+" "+this.name+" "+this.sal+" "+this.dept;
	}

	public int compareTo(Emp that){
		return this.empno-that.empno;
	}
	public boolean equals(Emp that){
		return this.empno==that.empno;
	}
}


class Perform_opt{
	int size=10;
	Emp [] e=new Emp[size];
	
	int ind=0;
	void add_Emp(Emp new_entry){
		
		e[ind]=new_entry;
		ind++;
	}
	
	void display(){
		
	for(Emp i:e){
		System.out.println("Name:"+i.getEmpno());
		System.out.println("Empployee"+i.getName());
		System.out.println("\n");
	}
	}
	
	
	
	
}












public class Obj_Array {

	public static void main(String[] args) {
		String name;
		int empno;
		Scanner sc=new Scanner(System.in);
		
		
		Perform_opt opt=new Perform_opt();
		// TODO Auto-generated method stub
		for(int i=0; i<2; i++){
			Emp ex=new Emp();
			System.out.println("Input Name:");
			name=sc.nextLine();
			
			System.out.println("Input Empno:");
			empno=sc.nextInt();
			sc.nextLine();
			
			ex.setEmpno(empno);
			ex.setName(name);
			opt.add_Emp(ex);
			
		
		
		}
		System.out.println("\n\n");
		
		opt.display();
	
	
	
	
	}

}
