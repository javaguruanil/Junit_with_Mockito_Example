package com.it;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class ATest {

	@Test
	public void testF1() {
		A a = Mockito.mock(A.class); // ===> Similar to @Mock annotation

		// Changing the function returning object's inside data i.e not "Anil"
		Mockito.when(a.f1()).thenReturn(new B("MOHANDU"));

		B b = a.f1();

		System.out.println(b);
	}
	
	@Test
	public void testF2(){
		A a = Mockito.mock(A.class); // ===> Similar to @Mock annotation

		//================================== when.thenReturn Example ==========================================
		
		// Changing the function returning data[44]  i.e not 88
		Mockito.when(a.f2(200,600)).thenReturn(44);

		int i = a.f2(200,600);   //=====> NOTE: f2 function inputs must be 200 and 600 bz in the above step we have used inputs 200 and 600,
		                         //             Otherwise no proper output.

		System.out.println(i);   //=====> output will be 44 but not 88.

		//================================== doReturn Example =================================================
		
		Mockito.doReturn(44).when(a).f2(1,1);

		System.out.println(a.f2(1,1));   //=====> output will be 44 but not 88.

	}
}
