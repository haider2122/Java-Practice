







class Books{
	String name="kafka on the shore";
	String author="Murakami";
	double price=349;
	
	Books(String name,String author,double price){
		this.name=name;
		this.author=author;
		this.price=price;
		int pgno=10;//Local Variable, pass into function as argument or declare as global
		
	} 
	Books(String name){
		this.name=name;
	
		int pgno=10;//Local Variable, pass into function as argument or declare as global
		
	}
	Books(){//COnstructor overloading
	
		int pgno=10;//Local Variable, pass into function as argument or declare as global
		
	} 
	
	public String toString(){
		
		return this.name+"\n"+this.author+"\n"+this.price+"\n";
	}
	
	
	
	void read(){
		System.out.println("I'm reading "+this.name);
	}
	
	
}

class Shelf{
	
	 String allbooks="";
	void addbooks(Books b){
		allbooks=allbooks+b.name+"\n";//Class object as parameter
	}
	void showbooks(){
		System.out.println(allbooks);
	}
	
}




















public class Oops {
	public static void main(String []args){
		
		Books b=new Books("EXTIAL Cafe","BakeWell",500);
		Books b2=new Books("Kafka On the shore");
		Books b3=new Books("1984");
		//overloading our constructor
		Books b4=new Books();
		
		
		System.out.println(b.name);
		b.read();
		System.out.println("______________________________");
		System.out.println(b);//implicit call to toString method
	
//	
	 Books[] objarr=new Books[3];
	 objarr[0]=b;
	 objarr[1]=b2;
	 objarr[2]=b3;//Object Array Creation, an array full of objects
	 System.out.println("___________________________________________");
	 System.out.println(objarr[1]);

	System.out.println("______________________________________________");
	
	Shelf sh=new Shelf();
	for (Books i : objarr) {
		sh.addbooks(i);//Passing Class object as parameter
	}
	
	sh.showbooks();
	

	}
	

}
