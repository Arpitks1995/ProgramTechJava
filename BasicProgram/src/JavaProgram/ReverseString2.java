package JavaProgram;

import java.util.Scanner;

public class ReverseString2 {

	public static void main(String[] args) {
	    String str="udit garg";
		String rev=" "; // Blank
		char ch[]=str.toCharArray();  // length=9
		
		for(int i=ch.length-1;i>=0;i--) { // i=9-1=8 // 8-1=7
			rev=rev+ch[i];  // rev=g+r=gr
		}
		
		System.out.println("Reverse String: "+rev);
		
	
	

	}

}
