package org.zoho;

import java.util.Scanner;

public class Q7Subset{
	static void printsubset(int set[]) {
		int n=set.length;
		for(int i=0;i<(1<<n);i++) {//2^n=8,pow(2,n)  i=0.i=1,i=3 011-[1.2]
			System.out.print("{");
			for(int j=0;j<n;j++) {
				if((i&(1<<j))>0) {  //010&100=010
					System.out.print(set[j] + "");
				}
			}
			System.out.println("}");
		}
	}
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements in the set:");
		int n=sc.nextInt();
		int set[]=new int[n];
		System.out.println("Enter the elements of the set");
		for(int i=0;i<n;i++) {
			set[i]=sc.nextInt();
		}
	printsubset(set);
			
		}
		
	}


