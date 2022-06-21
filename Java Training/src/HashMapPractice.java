import java.util.*;


import java.util.HashMap;

public class HashMapPractice {




	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		HashMap<String,Integer> prices= new HashMap<String,Integer>();
		System.out.println("Generate Bill:");
		
		String stemp;
		Integer itemp;
		for (int i=0; i<3; i++){
			System.out.println("Input Item and Cost:");
			stemp=scan.nextLine();
			itemp=scan.nextInt();
			prices.put(stemp,itemp);
			scan.nextLine();
		}
		System.out.println(prices);
		System.out.println(prices.size());
		prices.remove("tea");
		System.out.println(prices.containsValue("30"));
		System.out.println(prices.containsKey("Milk"));
		//prices.clear();
		for(String key:prices.keySet()){
			System.out.println(key+" "+prices.get(key));
		}
		
		
	
	}

}
