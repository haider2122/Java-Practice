import java.util.*;

public class ArrayList_Assignment {

public static void main(String [] args){
//	Assignment No:1 on ArrayList: 
//		Menu Driven Application with follwing Choices using ArrayList:
//		1. Add New Employee (empno,ename,sal,dept taken form user)
//		2. Update salary by empno ( empno and new salary taken from user)
//		3. Display employee details by empno (empno taken from user)
//		4. Show all employee details for a given dept in tabular form( dept taken from user)
//		5. Display all Employees details 
//		6. Remove employee details by empno
//		0: Exit	
	
	Scanner sc=new Scanner(System.in);
	List <Emp> arr_emp=new ArrayList<Emp>();//override
	
	
//				Collections Interface
//						
//	Lists				Sets			Queue							Maps
//						HashSet											
//																		HashMaps
//										ArrayDeque						TreeMaps
//										LinkedList
//									
//						Treeset
//	ArrayList
//	LinkedLists
//	Stacks
//	System.out.println("Input Values");
	
//	for(int i=0; i<1; i++){
//		Emp e =new Emp();
//		System.out.println("Input Empno");
//		e.setEmpno(sc.nextInt());
//		System.out.println("Input Name");
//		e.setName(sc.next());
//		System.out.println("Input Salary");
//		e.setSal(sc.nextInt());
//		System.out.println("Input Dept");
//		e.setDept(sc.next());
//		sc.nextLine();
//		arr_emp.add(e);
//		
//	}
	

//	System.out.println(((Emp)arr_emp.get(0)).toString());
//
//		int sal=50;
//		int empno=1;
//		
//   if(arr_emp.get(0).getEmpno()==empno){
//	   arr_emp.get(0).setSal(50);
//   }
//
//   System.out.println(((Emp)arr_emp.get(0)).toString());

	

	System.out.println("Input Number for case: ");

	int c=sc.nextInt();
	while(true){
	switch(c)
	{
	
//
	case 1: 
		System.out.println("Entering Values into Database");		
		while(true){
		Emp e =new Emp();
		System.out.println("Input Empno");
		e.setEmpno(sc.nextInt());
		System.out.println("Input Name");
		e.setName(sc.next());
		System.out.println("Input Salary");
		e.setSal(sc.nextInt());
		System.out.println("Input Dept");
		e.setDept(sc.next());
		sc.nextLine();
		arr_emp.add(e);//arraylist 
		
		System.out.println("Press e to exit");
		String exit=sc.nextLine();
		if(exit.equals("e")){
			break;	
		}
		
	}
		
		break;
		
		
		
	case 2:
		System.out.println("CASE 2, Updating Salay");
		System.out.println("Intput Empno");
		int empno1=sc.nextInt();
		int sal=sc.nextInt();
		
		sc.nextLine();
		System.out.println("Input Salary Amount");
		for(Emp i:arr_emp){
			if(i.getEmpno()==empno1){
				i.setSal(sal);
		  }	
		}
		
		
		
		break;
		
		
	case 3:
		System.out.println("CASE 3, fetch using Empno");
		System.out.println("Intput Empno");
		int empno2=sc.nextInt();
		sc.nextLine();
		for(Emp i:arr_emp){
			if(i.getEmpno()==empno2){
				System.out.println(i.toString());;
		  }	
		}
		break;
		
	case 4:
		System.out.println("CASE 4, Print all employess in db");
		String dept=sc.nextLine();
		sc.nextLine();
		for(Emp i:arr_emp){
			if(i.getDept().equals(dept)){
				System.out.println(i.toString());;
		  }	
		}
		
		break;
		
		
		
		
		
		
	case 5:
		for(Emp i:arr_emp){
		
		System.out.println(i.toString());;
		  
		}
		break;
		
	case 6:
			System.out.println("Delete f");
			int empno3=sc.nextInt();
		for(Emp i:arr_emp){
			
			if(i.getEmpno()==empno3){
				arr_emp.remove(i);
				
			}
		}
	case 7:
		System.out.println("Sort W.r.t Empno");
		Collections.sort(arr_emp);
		break;
	default: System.out.println("Wrong Choice");
		
	}
	




System.out.println("\n \n press 1 to exit,if not press a random key");

int exit=sc.nextInt();
	if(exit==1){
		break;
	}else{
		System.out.println("\nInput Number for case: ");

		 c=sc.nextInt();
	}

	
	
	
	
	}


}





}
