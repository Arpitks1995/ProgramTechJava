package JavaProgram;

public class StringLength {

	public static void main(String[] args) {
	// field it will take 5 charcter arpit o/p: Pass
		//4 character yaa 4 charater sai upar udit o/p:error is coming
		
		String str="arpit";
		if(str.length()!=5){
			System.out.println("Error : Input must be exactly should be 5 charater");
		}else {
			System.out.println("Accepted Input: "+str);
		}

	}

}
