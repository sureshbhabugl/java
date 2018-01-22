package javatut;

public class selectionsort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO clear the cache
		int [] arr = {1000,11,1,3,4,12,7,9,0,4,2000};
	    selectionsort(arr);
	    for (int c= 0; c<arr.length;c++){
			System.out.println(arr[c]);
		}
		
		

	}
	
	static int[] selectionsort(int a[])
	{
		int i, j, minValue, minIndex, temp = 0;
		for (i = 0; i < a.length; i++) {
			minValue = a[i];
			minIndex = i;
			for (j = i; j < a.length; j++) {
				if (a[j] < minValue) {
					minValue = a[j];
					minIndex = j;
				}
			}
			if (minValue < a[i]) {
				temp = a[i];
				a[i] = a[minIndex];
				a[minIndex] = temp;
			}
		}
		return a;
	}
}
