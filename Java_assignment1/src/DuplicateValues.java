import java.util.*;
class Testing{
  boolean validateEcardType( String parentOrg, String eCardType) {
	  
	  if(eCardType!="BOTH" && eCardType!="PRINT" && eCardType!="DIGITAL") {
		  return false;
	  }
 
    
    if ("BOTH".equalsIgnoreCase(parentOrg)) {
        return true;
    } else {
       
        if (!parentOrg.equalsIgnoreCase(eCardType)) {
            return false;
        }
        
    }
  
return true;
}

} 
public class DuplicateValues {

	public static void main(String[] args) {

//. Write a program to find duplicates in array in one iteration in java
	Testing t=new Testing();
	boolean b= t.validateEcardType("PRINT", "PRINT");
	if(b) {
	System.out.println("true");
	
	}else {
		System.out.println("false");
	}
	}
}
