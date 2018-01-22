package javatut;

import java.util.Arrays;

public class arraybinarysearch {
	//Program to find the 2nd largest number in an array
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stringsearch();
		
		
		
	}
	
	public static void stringsearch(){
		int[] arr = {100,200,309,40,15,16};
		Arrays.sort(arr);
		
		System.out.println(arr[arr.length-2]);
	}

}
