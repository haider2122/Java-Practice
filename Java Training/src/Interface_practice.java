

interface cam{
	
	 void cam();
}

interface sound{
	 void music();
	default void ringtone(){
		System.out.println("phone ringing");
	}
}


interface videos extends cam,sound{
	
	void video();
}
abstract class cellphone{
	
	abstract void call();
}


 class mbphone extends cellphone implements sound,cam,videos{
	 public void video(){
		 System.out.println("Taking video");
	 }
	 public void call(){
		 System.out.println("Calling");
	 }
	
	 public void cam(){
		 System.out.println("Click Photo");
	 }
	 
	 public void music(){
		 System.out.println("listen music");
	 }

	
	
}









public class Interface_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	mbphone mb=new mbphone();
	mb.cam();
	mb.music();
	mb.ringtone();
	mb.call();
	mb.video();
//	sound mb=new sound();
//	sound s=new sound();
	
//	sound s=new videos();
	
	

	
	}

}
