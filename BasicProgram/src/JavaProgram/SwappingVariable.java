package JavaProgram;

public class SwappingVariable {

	public static void main(String[] args) {
		int x=20;
		int y=30;
		int temp;
		
		System.out.println("value of x before Swapping : "+x); // 20
		System.out.println("value of y before Swapping : "+y); // 30
		
		temp=x;
		x=y;
		y=temp;
		
		System.out.println("*************************************************************************************************");
		
		System.out.println("value of x after Swapping : "+x); // 30
		System.out.println("value of y after Swapping : "+y); // 20
		
		

	}

}
