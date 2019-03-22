package com.finra.code;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {

	/*
	 * ========
	 * Java
	 * ========
	 * Given a list of people’s names “Ahmed”,”John”,”Eric” , write a java operation
	 * to remove all the names named “Ahmed”
	 * 
	 * Given a list of integers 1,2,3,4,5,6,7 etc. remove all values greater than 100
	 * 
	 */
		
	public static List<String> names() {
		List<String> names = Arrays.asList("Ahmed", "John", "Eric", "AHMEd", "Jay", "Ahmed Kamel", "Ahmed", "Santiago", "Mary", "", null);
		List<String> results = names.stream().filter(name -> !"Ahmed".equals(name)).collect(Collectors.toList());
		return results;
	}
	
	public static List<Integer> numbers() {
		List<Integer> numbers = Arrays.asList(1, 2, 14, 100, 2000, 34, 122, 555, 678, 333, null);
		List<Integer> results = numbers.stream().filter(n -> n != null && 100 < n).collect(Collectors.toList());
		return results;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("List of names: " + names().toString());		
		System.out.println("List of numbers: " + numbers().toString());
	
	}

}
