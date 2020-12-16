package com.shree.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class SomeBusinessMockTest {

	@Test
	void findGreatestOfAllTest() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {3,5,7});
		SomeBusinessImpl businessimpl = new SomeBusinessImpl(new DataServiceStub());
		assertEquals(7, businessimpl.findGreatestOfAll());
	}
	
	@Test
	void findGreatestOfAllTestForOneValue() {
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {7});
		SomeBusinessImpl businessimpl = new SomeBusinessImpl(new DataServiceStub());
		assertEquals(7, businessimpl.findGreatestOfAll());
	}

}
