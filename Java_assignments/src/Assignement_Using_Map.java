import java.util.*;
public class Assignement_Using_Map {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Map<Integer,Emp> map_emp=new HashMap<Integer,Emp>();
		int empno;
	
		while(true){

		System.out.println("Input Values");	
		Emp e =new Emp();
		System.out.println("Input Empno");
		empno=sc.nextInt();
		e.setEmpno(empno);
		System.out.println("Input Name");
		e.setName(sc.next());
		System.out.println("Input Salary");
		e.setSal(sc.nextInt());
		System.out.println("Input Dept");
		
		e.setDept(sc.next());
		sc.nextLine();
		
		map_emp.put(empno,e);
		
		System.out.println("Press e to exit");
		String exit=sc.nextLine();
		if(exit.equals("e")){
			break;	
		}
	
		}
		
		
		System.out.println("Input empno");
		 empno=sc.nextInt();
		 System.out.println(map_emp.get(empno));
		 
		
	}

}
