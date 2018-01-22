package javatut;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1000,11,1,3,4,12,7,9,0,4,2000};
		int i,j,temp;
		for(i = 0;i<a.length-1;i++){
			for(j=0;j<a.length-1-i;j++){
				if(a[j]>a[j+1]){
					temp= a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
				}// if
			} // for j
		} // for i
		
		for(int k = 0;k<a.length;k++)System.out.println(a[k]);
	}

}
