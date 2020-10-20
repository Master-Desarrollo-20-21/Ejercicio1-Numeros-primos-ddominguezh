package com.ddominguezh.master.v3.exercise;

import com.ddominguezh.master.v3.exercise.entity.Number;

public class AddTheFirstNumbersThatArePrime {

	private static int LIMIT = 50;
	
	public static void main(String[] args) {
		int max = args.length > 0 ? Integer.valueOf(args[0]).intValue() : LIMIT;
		int count = 0;
		Number total = new Number();
		Number number = new Number();
		while (count < max) {
			if(number.isPrime()) {
				count++;
				total.add(number);
			}
			number.add();
		}
		total.println();
	}

}
