package com.shree.junit;

public class MyMath {

	public int sum(int[] nums) {
		int sum = 0;
		for(int i:nums) {
			sum += i;
		}
		return sum;
	}
}
