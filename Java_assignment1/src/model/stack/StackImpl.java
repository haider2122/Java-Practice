package model.stack;
import java.util.*;
public class StackImpl {

	
	public static void main(String[] args) {
		//Write a program to implement Stack in java
		
		System.out.println("Hello");	
		
		
		System.out.println("First Stack");
		
		Stack stack1=new Stack();
	
		stack1.push(1);
		stack1.push("Hello");
		stack1.push(1.01);
		stack1.push(false);
		
		System.out.println(stack1.pop());
		System.out.println(stack1.display());
		
		
		
		System.out.println(stack1.peek());
		
		
		System.out.println("\n\n");
		System.out.println("Second Stack");
		
		List<Object> obj=new ArrayList<>();
		
		
		obj.add(1);
		obj.add("hhk");
		
		
		Stack stack2=new Stack(obj);
		System.out.println(stack2.display());
		
		
		
		
		System.out.println("\n\n");
		
		
		
		System.out.println("Third Stack");
		
	
		Object arr[]={"3rd Stack",2,3};
	
		
		Stack stack3=new Stack(arr);
		System.out.println(stack3.pop());
		System.out.println(stack3.peek());
		System.out.println(stack3.display());
	
	}
	
	
	
}
