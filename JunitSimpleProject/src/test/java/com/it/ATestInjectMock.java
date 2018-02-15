package com.it;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ATestInjectMock {

	@InjectMocks
	private A a;

	@Mock
	private C c;

	@Test
	public void testMethod1() {
		B b = a.f1();
		Mockito.when(c.getId()).thenReturn(8888);
        System.out.println(c.getId());
		assertNotNull(b);
	}
}
