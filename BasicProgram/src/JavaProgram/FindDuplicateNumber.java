package JavaProgram;

import java.util.HashSet;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		// i/p: 3,4,5,3,6,4
		
		int[] arr= {3,4,5,3,6,4,5};
		
		HashSet<Integer> set=new HashSet<Integer>();
		
		for( int i=0;i<arr.length;i++) {
			
			if(set.add(arr[i])==false) {
				
				System.out.println(arr[i]+ "is duplicate in the array");
			}
		}
		

	}

}
