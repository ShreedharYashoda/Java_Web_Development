package com.shree.mockito.mockitodemo;

public class SomeBusinessImpl {
	
	private DataService dataService;
	
	int findGreatestOfAll() {
		int[] data = dataService.retrieveAllData();
		int greatest = Integer.MIN_VALUE;
		for (int val : data) {
			if(val>greatest) greatest = val;
		}
		return greatest;
	}

	public SomeBusinessImpl(DataService dataService) {
		super();
		this.dataService = dataService;
	}

}

