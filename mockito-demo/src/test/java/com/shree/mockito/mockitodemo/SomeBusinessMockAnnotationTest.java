package com.shree.mockito.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class SomeBusinessMockAnnotationTest {
	
	@Mock
	DataService dataServiceMock;
	
	@InjectMocks
	SomeBusinessImpl businessimpl;

	@Test
	void findGreatestOfAllTest() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {3,5,7});
		assertEquals(7, businessimpl.findGreatestOfAll());
	}
	
	@Test
	void findGreatestOfAllTestForOneValue() {
		when(dataServiceMock.retrieveAllData()).thenReturn(new int[] {7});
		assertEquals(7, businessimpl.findGreatestOfAll());
	}

}
