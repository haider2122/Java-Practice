
public class WrapperClass {

	//STRINGS AND WRAPPER CLASS
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello How Are YOu?";
		
		String str1=str.toLowerCase();
		char str2=str.charAt(3);
		
//		String str3=str.contains("how");
		boolean flag=str.equals("Hello How Are YOu?");
		boolean empty=str.isEmpty();
		String str4=str.trim();
		int index=str.indexOf('H');
		System.out.println(index);
		/*
		Primitive vs Reference Data types
		
		primitive data type are faster by reference data types have lot of methods
		
		char int, boolean, double --->primitive
		Character, Integer, Boolean, Double--> reference
	 	autoboxing = the automatic conversion that the Java compiler makes between the primitive types and their corresponding object wrapper classes
       unboxing = the reverse of autoboxing. Automatic conversion of wrapper class to 
		
		
		*/
		  Boolean a = true;
		  Character b = '@';
		  Integer c = 123;
		  Double d = 3.14;
		 
		
		

	}

}
