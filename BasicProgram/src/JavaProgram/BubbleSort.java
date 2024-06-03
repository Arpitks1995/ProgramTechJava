package JavaProgram;

public class BubbleSort {

	public static void main(String[] args) {
	// I/p: 30,50,10,60,20
	// o/p: 10,20,30,50,60
	// o/p: 60,50,30,20,10
		
		int arr[]= {30,50,10,60,20}; // length=5 (0,1,2,3,4)
		int temp;
		
		for(int i=0;i<arr.length;i++) {
			
			for( int j=i+1;j<arr.length;j++) {
				
				if(arr[i]>arr[j]) {
					temp=arr[i];      // Swaping matlb change karna position
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		

	}

}
