package com.learning.problems;

import java.util.Scanner;



public class PrimeNumber {
	//to calculate nu,ber is prime or not, we need to get the number which is not divisible by another number
	//it cna be divisible by 1 or itself but not other number
	//1stmethod: find out if the number is divible by 2 to sqrt(n)
	//2nd method: find out if number is divisible by 2 yes mena number is not prime no mean in for loop we can increment each time by +2
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Integer number = new Scanner(System.in).nextInt();
		System.out.println(isPrime(number));
		.println(isPrime(number)));
		
	}

	public static boolean isPrime(Integer number) {
		Integer sqrt =(int) (Math.sqrt(number)+1);
	//	System.out.println("Sqrt of a number " + sqrt);
		for(int i=2;i<sqrt;i++) {
			if(number%i==0) {
				return false;
			}
		
		}
		return true;
	}
	
	public static boolean isPrime2(Integer number) {
		if(number==2 || number ==3) {
			return true;
		}
		if(number%2==0) {
			return false;
		}
		Integer sqrt =(int) (Math.sqrt(number)+1);
		//System.out.println("Sqrt of a number " + sqrt);
		for(int i=2;i<sqrt;i+=2) {
			if(number%i==0) {
				return false;
			}
		
		}
		return true;
	}
}
