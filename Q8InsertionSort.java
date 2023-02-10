package org.zoho;
import java.util.Arrays;

public class Q8InsertionSort {
	public static void main(String[] args) {
        int [] arr = {5,8,2,4,3,9};
        Insertionsort(arr);
}

public static void Insertionsort(int[] arr) {
		  for(int i=0;i<arr.length;i++) {
        	for(int j=1;j>0;j--) {
        		if(arr[j]<arr[j-1]) {
        			int temp = arr[j];
        			arr[j]= arr[j-1] ;
        			arr[j-1]= temp;
        			
        		}
        		else
        			break;
        	}
        }
        System.out.println(Arrays.toString(arr));
}
}


	