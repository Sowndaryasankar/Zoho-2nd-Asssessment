package org.zoho;
import java.util.*;

public class Q1Icecream {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of icecreams to buy:");
        int n = sc.nextInt();
        System.out.println("Enter the cost they have:");
            int C = sc.nextInt();
        for(int k = 0; k < n; k++){
           
            System.out.println("Enter the number of flavours:");
            int P = sc.nextInt();
            int [] p = new int[P+1];
            System.out.println("Enter the cost:");
       
            for(int i = 1; i <= P;i++)
            	p[i] = sc.nextInt();
       
            for(int i = 1; i <= P; i++){
                for(int j = i+1; j <= P; j++){
                    if(p[i]+p[j] == C){
                        System.out.println((i) + " " + (j));
                        break;
                    }
                }
            }
        }
        sc.close();
    }
}



	
