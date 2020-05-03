package com.learning.problems;

import java.util.Scanner;

public class FibonacciSeriesByRecursive {
	//Fib series is 0,1,1,2,3,5,8,13
		//if n is the number as input :fn=fn-1+fn-2
		//get the number, loop and store the fn-1,fn-2
		//assign fn=fn-1+fn-2
		//fn-1=fn-2
		//fn-2=fn an iterate
public static void main(String[] args) {
	System.out.println("Enter the number");
	int number = new Scanner(System.in).nextInt();
	for(int i=0;i<number;i++) {
		System.out.println(getFib(i));
	}
	
}

public static int getFib(int number) {
	int fib=0;
	if(number ==0|| number==1) {
		fib=number;
		return number;
	}
	fib = getFib(number-1)+getFib(number-2);
	
	return fib;
}
}
