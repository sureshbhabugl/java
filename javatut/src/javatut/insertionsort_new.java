package javatut;

public class insertionsort_new {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1000,11,1,3,4,12,7,9,0,4,2000};
		int i,j,key,temp;
		
		for(i=1;i<a.length;i++){
			key = a[i];
			j = i-1;
			while(j>=0&&key<a[j]){
				temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
				j--;
			}
		}
		
		for(int k = 0;k<a.length;k++)System.out.println(a[k]);
	}
	

}
