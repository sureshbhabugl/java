package javatut;
import java.util.*;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {2, 3, 4, 10,20, 40};
		   int n = arr.length;
		   int x = 2;
		   int res = mybinary(arr,0,n-1, x);
		   if(res==-1){
			   System.out.println("Item not found" );
		   }else  System.out.printf("Item found in %d index",res);
		   
		
	}
	
	public static int mybinary(int a[],int leftindex, int rightindex,int item){
		
		if(rightindex>=leftindex){
			
			int midindex = leftindex+(rightindex-leftindex)/2;
			if (item==a[midindex]) return midindex;
			if(a[midindex]>item) return(mybinary(a,leftindex,midindex-1, item));
			return (mybinary(a,midindex+1, rightindex,item));			
			
			
			
		}return -1;
		
				
	}

}
