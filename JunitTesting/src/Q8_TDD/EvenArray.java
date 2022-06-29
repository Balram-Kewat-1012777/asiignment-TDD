package Q8_TDD;

import java.util.Arrays;

public class EvenArray {

	public static int[] evenArray(int[] arr ) {
 
 int[] d = new int[arr.length];
//		System.out.println("Even Number contains:");
		for (int i = 0; i < arr.length; i++) {
			
			
			
			if((arr[i]%2==0) && (arr[i]%2!=1)) {
			 d[i]=arr[i];
				}
//		System.out.println("array d" +d[i]);
			}
		 if (Arrays.equals(d, arr)) {
			 System.out.println("Even");
			 
		 }
		 else {
			 System.out.println("all element of array are not even");
			 }
		return arr;
			
			
		}
		 
	 
		 
	
	
 

 
}
