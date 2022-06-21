import java.util.*;
public class MissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		Scanner sc=new Scanner(System.in);
		
		List<Integer> values=new ArrayList<>();
		List<Integer> inputs=new ArrayList<>();
		while(true){
			System.out.println("Add value in list");
			inputs.add(sc.nextInt());
	
			System.out.println("Press e to exit");
		
			String s=sc.next();
			if(s.equals("e")){
				for(int i=1; i<101; i++){
					values.add(i);
				}
				break;
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		System.out.println(values.removeAll(inputs));
		System.out.println(values.toString());
	}

}
