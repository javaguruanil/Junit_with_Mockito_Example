package com.it;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class VoidMethodMockTest {

	@Mock
	private VoidMethodMockClass voidMethodMockClass;

	@Test
	public void test_For_Void_Methods() {
		// NOTE: make we didn't pass any input, if inputs exists then it is
		// different case ==> refer "Atest.java" class
		Mockito.doNothing().when(voidMethodMockClass).m1();
		voidMethodMockClass.m1();
		System.out.println("make sure m1() not executed");
	}

}
