package javatut;

public class secondlargest {

	public static void main(String[] args) {
		int[] arr = {10,23,3,5,34,2330,12,1000};
		int current = arr[0];
		int prev = 0;
		for(int i=1;i<=arr.length-1;i++){
			for(int j =0;j<=arr.length-1;j++){
				if(arr[j]>current){
					prev = current;
					current = arr[j];
				}
				if(arr[j]<current&&arr[j]>prev) prev=arr[j];
				
			
				
			}
		}
		System.out.println(prev);

	}

}
