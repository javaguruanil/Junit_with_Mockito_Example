package com.it;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class InjecMockHumaneTest {
 
	@InjectMocks
	private Humane humane;

	//*******very important*************
	//Below is the=> Has-A relationship class with private access
	//Modifier inside Humane class 
	@Mock
	private Person person;  

	
	
	@Test
	public void has_A_Relationship_Test_case(){
		
		Mockito.when(person.getAge()).thenReturn(8888);
        int i=person.getAge();
        System.out.println(i);
        Assert.assertNotEquals(0, i);
	}
}
