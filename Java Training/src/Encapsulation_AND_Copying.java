class Test{
	private String make;
	private String model;
	
	Test(String make, String model){
		this.make=make;
		this.model=model;
		
	} 
	Test(Test t){
		this.copy(t);//copy constructor
	}
	
	
	private void message(){
		System.out.println("I'm the private method");
	}
	public void getMessage(){
		message();
	}
	
	//Set for a private method
	
	//set methods
	
	public void setMakeandModel(String make, String model){
		this.make=make;
		this.model=model;
	}
	//Get Methods
	public String  getModel(){
		return this.model;
	}public String getMake(){
		return this.make;
	}
	//Using separate set & get function to access private members
	
	
	
	
	
	//
//	using copy method//
	public void copy(Test t) {
		this.setMakeandModel(t.getMake(), t.getModel());

	}
	
}

public class Encapsulation_AND_Copying {
	
	public static void main(String []args){
		Test t=new Test("Nissan","GT");
		Test t2=new Test("Nissan","GT");
		
		
		//Copy 
		
//		t2=t; never do this, copies the memory, memory location of t2 will be lost
//		
		//Encapsulation
		
		
		System.out.println(t.getMake());
		System.out.println(t.getModel());
		t.getMessage();
		System.out.println("_____________________________________________");
		//Set values
		t.setMakeandModel("Porsche", "Cayam");
		System.out.println(t.getMake());
		System.out.println(t.getModel());//Our set methods in action
		
		t2.copy(t);
		Test t3=new Test(t);//direst copy and copy constructor
	}

}
