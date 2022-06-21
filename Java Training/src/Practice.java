import java.util.ArrayList;

//interface Cam{
//	public void takesanp();
//	default void record4KVideo(){
//        System.out.println("recording**");
//}
//
//interface Sound{
//	public void playmusic();
//	
//}
//
//class Phone implements Cam,Sound{
//	
//	public void takesnap(){
//		System.out.println("Snap Snap snap");
//	}
//	public void playmusic(){
//		System.out.println("Playing music");
//	}
//}










public class Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//get type of data
		
		int a=10;
		System.out.println(((Object)a).getClass().getSimpleName());
		Integer[] arr={1,2,3};
		System.out.println(arr.getClass().getSimpleName());
		
		
		System.out.println((String.valueOf('5')).getClass().getSimpleName());

		
		//Conversion of one to another
		
		String str="Haider, How are you?";
		String[] arr_char=str.split(" ");
		for(String i: arr_char){
			System.out.println((i).getClass().getSimpleName());
			break;
		}
//			System.out.println(arr_char.getClass().getSimpleName());
	
//		String arr_to_str=Arrays.toString(arr_char);
//		System.out.println(arr_to_str.toString());
	
		char[] ch_arr={'a','b','c'};
		String st=String.valueOf(ch_arr);
		System.out.println(st);
		String[] arr_str={"Haider","HOw ","Are","you?"};
		
		System.out.println(arr_str.toString());
		int g=Integer.max(3, 4);
	if (g==4){
		System.out.println(g);
	}
	
	String s="aaa";
	
		
	char [] arr_chr={'(',')'};
	
	String stc="abcd";
	ArrayList<Character> chars = new ArrayList<Character>();
    for (char c : stc.toCharArray()) {
    chars.add(c);
    }
    System.out.println(chars.get(0)+""+chars.get(1));
	
	

	}

}
