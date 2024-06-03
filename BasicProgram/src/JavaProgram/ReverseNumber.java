package JavaProgram;

public class ReverseNumber {

	public static void main(String[] args) {

// Reverse the Number
//	i/p: 786
//	o/p: 687
		int num=786;
		int sum=0;
		int rev;
		
		while(num!=0) {
			rev=num%10;     //rev=786%10=6   rev=6                78%10=8 rev=8          7%10= 7
			sum=(sum*10)+rev;  //0*10+6=0+6=6  sum=6           6*10+8=60+8=68  sum=68    68*10+7=680+7=687
			num=num/10;       // 786/10 =78.6  num=78          78/10=7.8 num=7           7/10=0.7 num=0
			
		}
		
		System.out.println("Reverse Number is : "+sum);
		
		
		
	}

}
