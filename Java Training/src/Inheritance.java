
//Inheritance, Overriding, abstraction and super keyword
abstract class Vehicle{//cannot be called, only for Inhertance purposes
	
	 abstract void greet();
	 //cannot use here, need to be overridden;
}class Car extends Vehicle{
	String colour="Red";
	String name;
	int topspeed;
	Car(String name,String colour,int topspeed){
		this.name=name;
		this.colour=colour;
		 this.topspeed=topspeed;
	}
	@Override
	void greet(){//Method overriding
		System.out.println("Hi,I'm an Car, how ar you doing?");
	}
	public String toString(){
		return this.name+"\n"+this.colour+"\n"+this.topspeed+"\n";
	}
	
}

class SportsCar extends Car{
//	String colour="Black";
	int gears;
	String comp=super.name;
	
	SportsCar(String name,String colour,int topspeed,int gears){
		super(name,colour,topspeed);
		
		
		this.gears=gears;
		
		
		
	}public String toString(){
		return super.toString()+this.gears+"\nAddded Values of super class:"+ comp;
	}

}

public class Inheritance {
	public static void main(String[]args){
		
		Vehicle v=new Vehicle();
		Car c=new Car("corola","Red",100);
		
		SportsCar spc=new SportsCar("Nissan","Grey",100,6);
		v.greet();
		c.greet();
		spc.greet();
		
		
		System.out.println("_____________________________________");
		System.out.println(c.colour);
		System.out.println(spc.colour);
		
		
		System.out.println("_____________________________________");
		System.out.println(c.name);
		System.out.println(spc.name);

		System.out.println("_____________________________________");
		System.out.println(c.name);
		System.out.println(spc.name);
		
		System.out.println("_____________________________________");
		System.out.println(c);
		System.out.println(spc);
		
	}
}
