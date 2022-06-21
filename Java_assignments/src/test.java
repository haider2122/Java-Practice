
import java.util.*;

public class test {

	
	
	public static void main(String [] args){
		
	
		int a=10;
		String name=null;
		
		try{
			
			a=name.length();
		}catch(RuntimeException e){
			++a;
			
		}
		System.out.println(a);
	}

}