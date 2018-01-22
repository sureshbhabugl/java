package javatut;

public class sumofconsecutivenumbers {

	/*
	 * 
	 * 1) Initialize both first and second largest
   first = max(arr[0], arr[1])
   second = min(arr[0], arr[1])
2) Loop through remaining elements (from 3rd to end)
   a) If the current element is greater than first, then update first 
       and second. 
   b) Else if the current element is greater than second then update 
    second
3) Return (first + second)
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] a = new int[]{1000,1,2000,450,3,5,100};
		
		
		System.out.println(largestsum(a));

	}
	
	static int largestsum(int[] a){
		
		int largest, secondlargest;
		largest = a[0];
		secondlargest = a[1];
		if(secondlargest>largest){
			largest = a[1];
			secondlargest = a[0];
		}
		
		for(int i=2;i<a.length;i++){
			if(a[i]>largest){
				secondlargest = largest;
				largest = a[i];
			} else if(a[i]>secondlargest) secondlargest=a[i];
				
			
		}
		return largest+secondlargest;
	}

}
