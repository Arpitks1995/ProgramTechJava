package JavaProgram;

public class SwappingWithoutVariable {

	public static void main(String[] args) {
	// Swapping without third variable
		
		int x=20;
		int y=30;
		
		
		System.out.println("value of x before Swapping : "+x); // 20
		System.out.println("value of y before Swapping : "+y); // 30
		
		x=x+y;  // 50
		y=x-y;  //50-30=20
		x=x-y;  //50-20=30
		
        System.out.println("*************************************************************************************************");
		
		System.out.println("value of x after Swapping : "+x); // 30
		System.out.println("value of y after Swapping : "+y); // 20
	    

	}

}
