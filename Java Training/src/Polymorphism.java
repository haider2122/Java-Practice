import java.util.*;


interface iso_standard_rating{
int rating(int r);


}

 interface iso_standard_status extends iso_standard_rating{
 
 boolean status(boolean val);

}


class company implements iso_standard_rating{
 String company_name;
 int mcap;
 int r=0;
 
 company(String company_name,int mcap){
	 this.company_name=company_name;
	 this.mcap=mcap;
	
 }

 public int rating(int r){
	this.r=r;
	return this.r;
}

void display_company_details(){
	System.out.println("Company Name: "+company_name+"  Mcap: "+mcap+"  Rating: "+r);
}


 
}


class Product extends company implements iso_standard_status,Comparable<Product>{

int id;

boolean b_val=false;
int price;

Product(int id, int price, String c_name,int mcap){
	super(c_name,mcap);
	this.id=id;
	this.price=price;
}

 public void setRating(int r){
		super.r=r;
		
	} 
 public int getRating(){
		return super.r;
		
	}

public boolean status(boolean val){
	this.b_val=val;
	return this.b_val;
}



public String toString(){
	
	return "Company Name: "+super.company_name+"  Mcap: "+super.mcap+"  Rating: "+super.r
			+"\nProduct Id: "+this.id+" Approval Status: "+this.b_val+" Cost: "+this.price
			;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public int getPrice() {
	return price;
}

public void setPrice(int price) {
	this.price = price;
}
public String getCompany_name() {
	return super.company_name;
}

public void setCompany_name(String company_name) {
	super.company_name = company_name;
}

public int getMcap() {
	return super.mcap;
}

public void setMcap(int mcap) {
	super.mcap = mcap;
}
 

public boolean equals(Object o){
	if(this==o){return true;}
	if(o==null || getClass()!=o.getClass()){return false;}
	Product p=(Product)o;
	return this.id==p.id;
}
public int compareTo(Product that){
	return this.id-that.id;
}

}

public class Polymorphism {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		
		company p1;
		p1=new Product(111,300,"Dabur",500);
		
		Product p2=(Product)p1;
		
		company p3;
		p3=(company)p2;
		
		
		
		p1.mcap=600;
		System.out.println(p1.mcap);
		System.out.println(p2.id);
		
		p1.display_company_details();
		System.out.println(p1.toString());
		System.out.println(p2.status(false));
		
		
		
		List <Product> arrlist=new ArrayList<Product>();
		Set<Product> treeset=new TreeSet<>();
		Map<Integer,Product> hashmap=new HashMap<>();
		
		
		
		while(true){
			System.out.println("Product Id: ");
			int id=sc.nextInt();
			
			System.out.println("Product Price: ");
			int price=sc.nextInt();
			
			System.out.println("Company Name: ");
			String name=sc.nextLine();
			sc.nextLine();
			System.out.println("Market Cap: ");
			int mcap=sc.nextInt();
			sc.nextLine();
			
			System.out.println("Rating: ");
			int rating=sc.nextInt();
			
			
			Product p=new Product(id,price,name,mcap);
			p.setRating(rating);
			arrlist.add(p);
			//treeset.add(new Product(id,price,name,mcap));
			
			hashmap.put(id,p);
			
			sc.nextLine();
			System.out.println("Press e to exit");
			String exit=sc.nextLine();
			if(exit.equals("e")){
				break;	
			}

			sc.nextLine();
		}
		
		
		System.out.println("ArrayList---");
		for(Product i:arrlist){
			if(i.getRating()>3){
			i.status(true);
			treeset.add(i);
			System.out.println(i.toString());
		}
		}
	
		System.out.println("\nHashMap---");
		System.out.println(hashmap.get(112));
	
	
	
	System.out.println("\nFinal List of Approved companies");
	
	
	System.out.println(treeset.toString());
	
	Collections.sort(arrlist, new Comparator<Product>(){
		public int compare(Product p1, Product p2){
			return p1.company_name.compareTo(p2.company_name);	
		}
		 
	});
	System.out.println("Sorted Array List according to company-");
	System.out.println(arrlist.toString());
	
	}

}
