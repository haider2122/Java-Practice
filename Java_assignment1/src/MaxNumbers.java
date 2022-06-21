import java.util.*;


public class MaxNumbers {
public static void main(String[] args) {
	/*
}
	. Write a program to find maximum numbers in array in one iteration(single loop) in java
    For example: Given array arr[] = { 44, 7, 9, 11, 2, 93 }
                          Output will be 93 and 44
}*/


System.out.println("Hello");

int arr[]={99,44,0,7,9,11,2,93,94,0,101,105};

int max=arr[0];
int max2=arr[1];
Arrays.sort(arr);
		
for(int i:arr){
	if(i>max){
	
         max2=max;
         max=i;
	}
	 if(i>max2 && i<max){
		 max2=i;
	 }
	
	
	
}
System.out.println(Arrays.asList(max,max2));




}


}
