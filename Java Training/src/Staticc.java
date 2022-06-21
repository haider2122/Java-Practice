
 class Person{
	
	static String sport="";
	static int workout=0;
	
	Person(String sport){
		
		this.sport=sport;
		this.workout++;
	}
	
}

public class Staticc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Person p1=new Person("Wrestling");
			Person p2=new Person("Boxing");
			
			System.out.println(p1.sport);//This is not preferable
			//Tries to create a separate individual entity of sport and work out for itself
			//Since we are using static only use Class_name.attribute/method
			//Static maintains a global values for a class
			System.out.println(p2.sport);
			System.out.println(p1.workout);
	}

}
