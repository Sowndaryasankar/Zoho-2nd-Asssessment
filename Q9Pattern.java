package org.zoho;
import java.util.Scanner;

public class Q9Pattern {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();
        for(int i = 1; i <= n; i++) {
    	      for (int j = 1; j <= n; j++) {
    	        if (i == 1 || i == n || j == 1 || j == n) {
    	          System.out.print("1");
    	        } else {
    	          System.out.print("0");
    	        }
    	      }
    	      System.out.println();
    	    }
    	  }
    	}
       
        