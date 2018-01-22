package com.it;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class MockAnnotationExampleTest {
	@Mock
	private MockAnnotationExample mae;
	
	@Test
	public void testF1() {
        mae.f1();
	}
}
