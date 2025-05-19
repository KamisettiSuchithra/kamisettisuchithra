package suchithra;

import java.util.Scanner;

public class project2 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter value of n: ");
	        int n = sc.nextInt();

	        for (int i=0;i<n;i++) {
	        	int oddsequence=2*i+1;
	        	System.out.print(oddsequence);
	        	if(i<n-1) {
	        		System.out.print(",");
	        
	        	}
	        	
	        }
	        
	    }
	    
	}
