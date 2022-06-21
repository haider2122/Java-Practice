import java.util.Scanner;
public class Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Input name:");
		String name=scanner.nextLine();
		System.out.println("How old are you?:");
		int age=scanner.nextInt();//nextDouble or nextFloat
		scanner.nextLine();
		System.out.println("Are a Stoic?");
		String desig=scanner.nextLine();
		System.out.println("Hi : "+name+"!");
		System.out.println("You are :"+age);
		System.out.println("Stoic:"+desig);
		
		
		/*
		Primitive vs Reference Data types
		
		primitive data type are faster by reference data types have 
		
		
		*/
		
		
	}

}
