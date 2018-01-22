package com.it;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mockito;

public class SampleProgramTest {
	
   private static SampleProgram sampleProgram= null; 

	@BeforeClass
	public static void beforeClassApi(){
		System.out.println("before-class");
		sampleProgram = new SampleProgram();		
	}
	
	@Before
	public void beforeApi(){
		System.out.println("before");
	}
	
	@Test
	public void testF1() {
		int i=0;
		System.out.println("Testing case");
		if(sampleProgram != null ){
			sampleProgram.f1(1, 1);
			//we can use the assertXxxxx methods , if u want for testing purpose.
		}
	}
	
	@After
	public void afterApi(){
		System.out.println("after");
	}
	
	@AfterClass
	public static void afterClassApi(){
		System.out.println("after-class");
	}
	
}
