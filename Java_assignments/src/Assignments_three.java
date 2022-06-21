import java.util.Collections;
import java.util.Scanner;
import java.util.*;





 class Perimeter{
	double pi=3.14;
	
	public void calc(int [] arr){
		
		for(int i: arr){
			System.out.println("");
		System.out.printf("Perimeter Value:%.2f",(i*2*pi));
		}
	} 
	
}








public class Assignments_three {

	 static void sorted(int arr[])
	    {
	        int n = arr.length;
	 
	        // One by one move boundary of unsorted subarray
	        for (int i = 0; i < n-1; i++)
	        {
	            // Find the minimum element in unsorted array
	            int max_idx = i;
	            int j=i+1;
	            while(j<n){
	                if (arr[j] > arr[max_idx])
	                    max_idx = j;
	                	j++;
	            }
	            // Swap the found minimum element with the first
	            // element
	            int temp = arr[max_idx];
	            arr[max_idx] = arr[i];
	            arr[i] = temp;
	        }
	    }
	 

	public static void main(String[] args){
//		Task 1: Sort the values given in 1-D(one dimensional) int array in a descending order and display it.
//		Task 2: Find and display the frequency(how many times repeated) in a given int 1-D array.
		Scanner scan=new Scanner(System.in);
		int []arr=new int[5];
		System.out.println("Input Array Values:");
		for(int i=0; i<5;i++){
			arr[i]=scan.nextInt();
		}
		System.out.print("Printing Values sorted Values in reverse: ");
		sorted(arr);
//		
		for(int i=0; i<5;i++){
			System.out.print(arr[i]+"\t");
	}
		System.out.println("");
		
		 ArrayList<Integer> list =
                 new ArrayList<Integer>();
		 
		for(int i: arr){
			list.add(i);
		
		}
		
		
		for(Integer i: list){
			System.out.print("Frequency Of "+i+" :"+ Collections.frequency(list, i)+"\t");
		
		}
		
		
//		Task 3: Define a function getPerimeter( int radius[] ) to calculate the perimeter of five circles whose radius passed
//		as parameter and return the result as a int array. Perimeter=2 x pi X radius , pi=3.14
		Perimeter p= new Perimeter();
		
		p.calc(arr);
		
		//merge two arrays
//		Task 4: Develop a java code to define a function mergeTwoArray(). Pass two one-Dim int array having integer
//		values. the function will return one int array as result after merging all values in ascending order.
		List merged=new ArrayList(Arrays.asList(arr));
		int []arr2={6,8,9};
		merged.addAll(Arrays.asList(arr2));
		
		Object []sorted_vals=merged.toArray();
		
		for(Object i:sorted_vals){
			System.out.println("");
			System.out.print("Merged and Sorted Array: "+i.toString()+"\n");
		}
	
		
		
		
	}
	
}
