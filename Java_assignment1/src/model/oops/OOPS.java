package model.oops;

import java.util.Arrays;
import java.util.List;

abstract class normalPhone{
 List<String> contacts=Arrays.asList("Rahul","John","Greg");
abstract public void call(String name);	
	



}


class smartPhone extends normalPhone implements Camera,Music{

	private String model;
	private double price;
	
	
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	

	@Override
	public void call(String name) {
		
	if(super.contacts.contains(name)){;
		
	for(String i:super.contacts){
		if(i.equals(name)){
			System.out.println("Calling......"+i);
		}
	}
	
	}else{
		
		System.out.println("Contact doesn't exist");
	}
		
		
	}

	@Override
	public void listenMusic() {
		System.out.println("Listening to music");
		
	}

	@Override
	public void takePicture() {
		System.out.println("Take pictures");		
	}

	@Override
	public void takeVideos() {
		System.out.println("Take videos");
		
	}

	@Override
	public String toString() {
		return "smartPhone [model=" + model + ", price=" + price + "]";
	}
	
	
	
	
	
}


class androidPhoneOS extends smartPhone implements PlayStore{

	



	private String androidVersion;
	
	
	public String getAndroidVersion() {
		return androidVersion;
	}


	public void setAndroidVersion(String androidVersion) {
		this.androidVersion = androidVersion;
	}


	@Override
	public void dowloadApp() {
		System.out.println("Dowloading application............");
		
	}
	
	
	
	
	
	@Override
	public String toString() {
		return "androidPhoneOS [androidVersion=" + androidVersion + "]"
	
	+" Model [Model=" + super.getModel()+ "]"
	
	+" Price [Price=" + super.getPrice()+ "]"
	;
	
	}
	
	
	
	
	
	
} 














public class OOPS {
public static void main(String[] args) {
	

	androidPhoneOS apos=new androidPhoneOS();
	
	System.out.println(apos.contacts);


			apos.listenMusic();
			apos.call("Gre");
			apos.dowloadApp();




			
			apos.setModel("A222");
			apos.setPrice(2000);
			apos.setAndroidVersion("oreo");
			
				System.out.println(apos);


			smartPhone sp=new androidPhoneOS();
			sp.setModel("Z20");
			sp.setPrice(320.0);
			
			
			System.out.println(sp);
			
				
			Camera cam=new androidPhoneOS();
			cam.takePicture();
	
	
}


}
