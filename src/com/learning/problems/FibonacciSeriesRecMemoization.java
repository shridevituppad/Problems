package com.learning.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FibonacciSeriesRecMemoization {
	
	public static void main(String[] args) {
		System.out.println("Enter the number:");
		Integer number = new Scanner(System.in).nextInt();
		Map<Integer,Integer> memMap = new HashMap<Integer,Integer> ();
		for(int i=0;i<number;i++)
		System.out.println(getFib(i,memMap));
	}
public static Integer getFib(Integer number,Map<Integer,Integer> memMap) {
	Integer fib=0;
	if(number==0 || number ==1) {
		memMap.put(number, number);
		return number;
	}
	if(memMap.containsKey(number)) {
		System.out.println("from map: " +memMap.get(number));
	 return memMap.get(number);
	}
	fib= getFib(number-1,memMap)+getFib(number-2,memMap);
	memMap.put(number, fib);
	return fib;
}
}
