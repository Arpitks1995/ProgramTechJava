package JavaProgram;

import java.util.*;

public class RemoveDuplicateNumber {

	public static void main(String[] args) {
		// i/p:5,3,4,5,5,4,9,7,6,9
		// o/p:5,3,4,9,7,6
		
		int[] arr= {5,3,4,5,5,4,9,7,6,9}; // length=10
		
		Set<Integer> set=new HashSet<Integer>();  // Only Store the Unique number not duplicate
		
		for(int i=0;i<arr.length;i++) { // 0<10 1+1=2 2<10 3 3<10
			set.add(arr[i]);  // 5,3,4
		}
		
		Integer[] b=set.toArray(new Integer[set.size()]);  // Set ko directly print nahi kar sakte isliye Array mai convert kiya hai
		
		System.out.println(Arrays.toString(b));

	}

}
