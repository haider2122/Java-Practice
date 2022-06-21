import java.util.ArrayList;

public class ArrayLists {
	public static void main(String [] args){
		ArrayList<String> dept= new ArrayList<String>();
		
		dept.add("IT");
		dept.add("Finance");
		dept.add("HR");
		
		System.out.println(dept);
		dept.remove("HR");
		dept.set(1, "FinTech");
		
		for(int i=0; i<dept.size(); i++){
			System.out.println(dept.get(i));
		}
		
		ArrayList<String> dept2= new ArrayList<String>();//using wrapper classes Inside
		dept2.add("HR");
		dept2.add("CS");
		dept2.add("MIS");
		
		
		ArrayList<ArrayList<String>> comp=new ArrayList();
		
		comp.add(dept);
		comp.add(dept2);
		
		System.out.println("_____________________________________");
		System.out.println(comp);
		
		//comp.get(0).get(1)
		//comp.get(0).set(1, element)
		
		for(String i: dept2){
			System.out.println(i);
		}
		
		String str="BCA";
		char[] ch = str.toCharArray();
		
		
		System.out.println("Val"+comp.get(-1));
		
	
	}

}
