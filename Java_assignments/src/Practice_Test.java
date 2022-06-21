class Write{

	void content(){
		System.out.println("I am *Writing*");
	}
}

class Pen extends Write{

	void content(){
	System.out.println("I am wriitng with a *Pen*");
}
}
class Pencil extends Write{
	void content(){
	System.out.println("I am wriitng with a *Pencil*");
}
}



public class Practice_Test {
	
	public static void main(){
		
		
		System.out.println("111");
		// TODO Auto-generated method stub
		
		//Simple polymorphism
	
		
		Write w= new Write();
		Pen p=new Pen();
		Pencil pl=new Pencil();
		
		Write [] write ={w,p,pl};// All object identify as another
		
		for(Write i:write){
			
			i.content();
}
		
		//Dynamic Polymorphism
	
		
//		w.content();
//		p.content();
//		pl.content();
		
		
	}

}
