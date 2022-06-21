import java.util.*;
import java.util.Collections;
public class Assignments_two {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//	a) Palindrome String check. 
//	b) Toggle the given word characters. 
//	c) Finding frequency of letters in a word.
//	d) Squeeze extra spaces in a sentence.
//	e) Sort the names in ascending order.
//	f) Reverse each word in a given sentence.
//	g) Convert a given sentence in a title case 
//	h) Shortening the first and middle names of a given employee name.
//	i) Convert the given date format from a string “Jan-6-2020” to “06/01/2020” .

	String str="madam";
	
	int i=0;
	int j=str.length()-1;
	int count=0;
	int itr=(int)(str.length()/2);
	while(i<itr){
	
		if(str.charAt(i)==str.charAt(j)){
		count++;
		}
		i++;
		j--;
	}
	if (count==itr){
		System.out.println("Yes");
	}else{
		System.out.println("No");
	}
	
	
	String str2="Qwmwkm#A@";
	for(int k=0; k<str2.length();k++){
		if(Character.isLetter(str2.charAt(k))){
			if(Character.isUpperCase(str2.charAt(k))){
				System.out.print(Character.toLowerCase(str2.charAt(k)));
			}else{System.out.print(Character.toUpperCase(str2.charAt(k)));
				
			}
		}else{
			System.out.print(str2.charAt(k));
		}
	
	
	}
	
	 String[] str_split= str.split("");
	  
     // Now convert string into ArrayList
     ArrayList<String> str_list= new ArrayList<String>(Arrays.asList(str_split));
     
     System.out.println("\nFrequency :");
	for(String s: str_list){
	
		System.out.print(s+":"+Collections.frequency(str_list, s)+"\t");
	}
	
//	Squeeze extra spaces in a sentence.
	
			String str_squeeze="  Troy   Greece         Rome  " ;
			System.out.println("");
			System.out.println(str_squeeze.trim().replaceAll("\\s+", " "));
			
			//Sorting Names
			
			String[] str_sort={"Delhi","Bombay","Bangalore","Kolkata"};
			
			Arrays.sort(str_sort);
			System.out.println(Arrays.toString(str_sort));
			Collections.sort(Arrays.asList(str_sort));
			System.out.println();
			System.out.println(Arrays.toString(str_sort));
			
//			f) Reverse each word in a given sentence.

			String str_reverse="Hello How are you doing";
			
			
	
	
	
			String str_reversed="";
	
			String[]str_arr=str_reverse.split("");
			String temp="";
			for(String s:str_arr){
				if(s.equals(" ")){
					
					str_reversed=str_reversed.concat(temp)+" ";
					
					temp="";
				}else{
					temp=s+temp;
				}
			
			}
	
			
			
			System.out.println(str_reversed);
	
			
//			String title_case="how are you doing";
//			int iter=0;
//			boolean flag=true;
//			while(iter<title_case.length()){
//				
//				if(flag=true){
//				System.out.print(Character.toUpperCase(title_case.charAt(iter))); flag=false;}
//			}
			
		
	
	
	}
}

