import java.util.*;


class Objtest{
	void fun1(){
		System.out.println("Hello");
	}
}
public class Objects_and_lists {
   
	public static void main(String []args)
	{
		
		List l=new ArrayList();
		
		Objtest ob=new Objtest();
		l.add(Integer.parseInt("1"));
		l.add("123");
		l.add(ob);
		
		System.out.println(l.getClass().getCanonicalName());
		for(Object i: l){
			
			System.out.println(i);
		}
	
		System.out.println(l.get(0) instanceof Integer);
		System.out.println(l.get(1) instanceof String);
		System.out.println(l.get(2) instanceof Objtest);
	}
}
	

