package com.logical.day6assign;

import java.util.Scanner;

public class PrimeNumberProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		       Scanner s = new Scanner(System.in);  
		       System.out.print("Enter a number : ");  
		       int n = s.nextInt();  
		       if (isPrime(n)) {  
		           System.out.println(n + " is a prime number");  
		       } else {  
		           System.out.println(n + " is not a prime number");  
		       }  
		   }  
		  
		   public static boolean isPrime(int n) {  
		       if (n <= 1) {  
		           return false;  
		       }  
		       for (int i = 2; i < (n); i++) {  
		           if (n % i == 0) {  
		               return false;  
		           }  
		       }  
		       return true;  
		     
	}

}
