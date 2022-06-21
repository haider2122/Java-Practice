import java.util.*;

public class ReverseString {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		/* Write a program to find reverse words in sentence in java
	      For Example : input = "Hello World"
                  output = "world hello"*/
	
		System.out.println("Input a String");
	
		String s=sc.nextLine();
		
		String reverse="";
		String temp="";
	
	for(int i=0; i<s.length(); i++){
		
		if(s.charAt(i)==' '){
			
			reverse=s.charAt(i)+temp+reverse;
			temp="";
		}else{
			
			temp=temp+s.charAt(i);
			//System.out.println(temp);
		}
		
		
		if(s.length()-1==i){
			reverse=temp+reverse;
		}
	
	}
	
	

		System.out.println(reverse);
	
	}
	
 
}
