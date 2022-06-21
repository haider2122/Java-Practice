
public class Methods {
	public static void main(String [] args){
		
		add(1,2);
		
//		System.out.println(trim_val("   Haider    "));
	}
	static void add(int x, double y,String message){
		double z= x+y;
		System.out.println(z+"\n"+message);
	}
	static void add(int x, double y){
		double z= x+y;
		System.out.println(z);
	}
	static String trim_val (String s){// can be int double or anything else of the sort
		return s.trim();
		
	}
	static int add(int x,int y){
		
		return x+y;
	}
	
	static int add(int x,int y, int z){
		return x+y+z;
		
	}
	static double add(double x,double y){
		return x+y;
	}
	static void add(double x, double y){
		return x+y;
	}
	
	
}
