package javatut;

public class mergesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1000,11,1,3,4,12,7,9,0,4};
		sort(a,0,a.length-1);
		for(int k = 0;k<a.length;k++)System.out.println(a[k]);
	}

	
	private static void sort(int[] a, int left,int right){
		if(left<right){
			int mid = (left+right)/2;
			
			sort(a, left, mid);
			sort(a,mid+1, right);
			merge(a,left,mid,right);
			
		}
	}
		
	


	private static void merge(int[] a, int left, int mid, int right) {

		int n1 = mid-left+1;
		int n2 = right-mid;
		int [] L = new int[n1];
		int [] R = new int[n2];
		
		for (int i=0;i<n1; ++i){
			L[i] = a[left+i];
		} // end of for i
		
		for(int j =0;j<n2;++j){
			R[j] = a[mid+1+j];
			
		} //end of for j
		
		int k = left;
		int i=0;
		int j=0;
		while(i<n1&&j<n2){
			if(L[i]<=R[j]){
				a[k]=L[i];
				i++;
				
			}else{
				a[k] = R[j];
				j++;
			}
			k++;
		}// end of while
		while(i<n1){
			a[k] =L[i];
			i++;
			k++;
		}
		while(j<n2){
			a[k] =R[j];
			j++;
			k++;
		}
	}
}
