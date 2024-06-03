package JavaProgram;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String rev=" ";
	System.out.println("Enter the Input");
	String input=sc.nextLine(); // udit garg
	char ch[]=input.toCharArray(); // yha humne character liya aur string ko arrays kai andar convert kardiya
	 // Total Length of Udit Garg =9
	
	for(int i=ch.length-1;i>=0;i--) { //i=9-1=8   // i=8-1=7
		
		
		rev=rev+ch[i];  // rev= g+r // rev=g
		
	}
	
	System.out.println("Reverse String : "+rev);

	}

}
