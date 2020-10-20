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
	public Number add() {
		this.value += 1;
		return this;
	}
	public Number add(Number newInteger) {
		this.value += newInteger.value;
		return this;
	}
	public boolean isPrime() {
		for(int count = FIRST_PRIME_NUMBER ; count < value ; count++) {
			if(value % count == 0) {
				return false;
			}
		}
		return this.value >= FIRST_PRIME_NUMBER;
	}
	public boolean isLowerThat(int value) {
		return this.value < value;
	}
	public void println() {
		System.out.println(this.value);
	}
}
