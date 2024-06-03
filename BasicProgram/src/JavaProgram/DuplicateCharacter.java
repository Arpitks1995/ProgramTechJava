package JavaProgram;

import java.util.LinkedHashSet;
import java.util.Set;

public class DuplicateCharacter {
	
	//Remove the Duplicate Character from the String

	public static void main(String[] args) {
		String str="coconut";
		Set<Character> set=new LinkedHashSet<Character>();
		
		for(int i=0;i<str.length();i++) {  // length=7  1<7
		  
			set.add(str.charAt(i));	  // set.add(o)
			
		}
		
		StringBuffer sb=new StringBuffer();  // Create one object for the unique value
		
		for(Character c : set) {    //  c    set= coconut
			sb.append(c);   //conut only unique value will be stored
		}
		
		System.out.println("String after removing duplicate value: "+sb);  // conut
		
		
	}

}
