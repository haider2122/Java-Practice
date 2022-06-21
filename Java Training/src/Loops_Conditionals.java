import java.util.Random;
import java.util.Scanner;

public class Loops_Conditionals {
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		String str2=scanner.nextLine();
		String str="Haider";
		
		while(str2.isEmpty()){
			System.out.println("Enter your name");
			str2=scanner.nextLine();
	
		}
		
	if(!str.equals(str2)){//not operator
			System.out.println("Welcome"+str2);
			
			
		}else{
			
			System.out.println("Wrong User name");
		}
		
////		for(int i=0; i<=10; i++){ 
//	for(int i=0; i<=10; i++){ //nested loops
//		
////		
////		 }
////		
////		 }
	
//	  ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
//	  list.add("Mango");//Adding object in arraylist    
//	  list.add("Apple");    
//	  list.add("Banana");    
//	  list.add("Grapes");    
//	  //Traversing list through Iterator  
//	  Iterator itr=list.iterator();//getting the Iterator  
//	  while(itr.hasNext()){//check if iterator has the elements  
//	   System.out.println(itr.next());//printing the element and move to next  
//	  }  

	}
	
	
}
