package com.ddominguezh.master.v3.exercise.entity;

public class Number {

	private static int FIRST_PRIME_NUMBER = 2;
	private int value;
	public Number() {
		this.value = 0;
	}
	public Number(int value) {
		this.value = value;
	}
	public Number next() {
		this.value += 1;
		return this;
	}
	public Number sum(Number newInteger) {
		this.value += newInteger.value;
		return this;
	}
	public boolean isPrime() {
		return value == FIRST_PRIME_NUMBER || value > FIRST_PRIME_NUMBER && isOdd() && notFoundDivisors() ;
	}
	private boolean isOdd() {
		return !isEven();
	}
	private boolean isEven() {
		return value % FIRST_PRIME_NUMBER == 0;
	}
	private boolean notFoundDivisors() {
		for(int count = FIRST_PRIME_NUMBER + 1 ; count < value ; count+=2) {
			if(value % count == 0) {
				return false;
			}
		}
		return true;
	}
	public boolean isLowerThat(int value) {
		return this.value < value;
	}
	public void println() {
		System.out.println(this.value);
	}
}
