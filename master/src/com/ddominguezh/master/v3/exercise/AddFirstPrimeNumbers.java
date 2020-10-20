package com.ddominguezh.master.v3.exercise;

import com.ddominguezh.master.v3.exercise.entity.Number;

public class AddFirstPrimeNumbers {

	private static int LIMIT = 50;
	
	public static void main(String[] args) {
		int max = args.length > 0 ? Integer.valueOf(args[0]).intValue() : LIMIT;
		Number total = new Number();
		for (Number number = new Number(); number.isLowerThat(max) ; number.add()) {
			if(number.isPrime()) {
				total.add(number);
			}
		}
		total.println();
	}

}