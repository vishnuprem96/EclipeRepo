package junitTest;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runners.model.TestTimedOutException;

public class TestAdditionUnit {

	@Test(timeout=4000/*expected=TestTimedOutException.class*/)
	public void testadd() throws Exception
	{ 
		Thread.sleep(3000);
		AdditionTest a = new AdditionTest();
		int add = a.additionTest();
		
		//assertEquals(4,add);
		assertEquals(5,add);
		
	}
	
	@Ignore("Ignored")
	@Test
	public void testdiff() 
	{ 
		AdditionTest b = new AdditionTest();
		int difference = b.subTest();
		
		//assertEquals(7,difference);
		assertEquals(3,difference);
		
	}

}
