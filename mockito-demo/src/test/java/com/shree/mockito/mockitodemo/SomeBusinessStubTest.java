package com.shree.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SomeBusinessStubTest {

	@Test
	void findGreatestOfAllTest() {
		SomeBusinessImpl businessimpl = new SomeBusinessImpl(new DataServiceStub());
		assertEquals(7, businessimpl.findGreatestOfAll());
	}

}


class DataServiceStub implements DataService{

	@Override
	public int[] retrieveAllData() {
		// TODO Auto-generated method stub
		return new int[] {2,4,7};
	}
	
}