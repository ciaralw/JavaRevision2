package javaRevision2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyUnitTest {

	@Test
	public void testConcatenate() {
		MyUnit myUnit = new MyUnit();
		
		String result = myUnit.concatenate("one", "two");
		
		assertEquals("onetwo", result);
	}
	
	@Test
	public void testConcatenate2() {
		MyUnit myUnit = new MyUnit();
		
		String result2 = myUnit.concatenate("Bob", "Bobson");
		
		assertEquals("BobBobson", result2);
	}

	@Test
	public void testConcatenate3() {
		MyUnit myUnit = new MyUnit();
		
		String result3 = myUnit.concatenate("Bob", "Bobson");
		
		assertNotEquals("BobBlobson", result3);
	}
}
