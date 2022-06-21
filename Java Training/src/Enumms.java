
enum Planet{

	
	MERCURY(1,"Not Habitable"),VENUS(2,"Not Habitable"),EARTH(3,"Habitable"),MARS(4,"Not Habitable"),JUPITER(5,"Not Habitable"),SATURN(6,"Not Habitable"),URANUS(7,"Not Habitable"),NEPTUNE(8,"Not Habitable"),PLUTO(9,"Not Habitable");
	
	int number;
	String status;
	Planet(int number, String status){
		this.number=number;
		this.status=status;
	}
}

public class Enumms {
	int a=10;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Planet earth=Planet.EARTH;
		System.out.print(earth+"\t");
		System.out.print(earth.number+"\t");
		System.out.println(earth.status+"\t");
		
		Planet neptune=Planet.NEPTUNE;
		
		System.out.print(neptune+"\t");
		System.out.print(neptune.number+"\t");
		System.out.print(neptune.status+"\t");
		
	}
	

}
