package javaRevision2;

import static org.junit.Assert.*;

import org.junit.Test;

public class IcyHotTest {

	@Test
	public void testIcyHot() {
		
		IcyHot icyHot = new IcyHot();
		
		boolean result = icyHot.icyHot(120, -1);
			
		assertEquals(true, result);
	}

	@Test
	public void testIcyHot2() {
		
		IcyHot icyHot = new IcyHot();
		
		boolean result2 = icyHot.icyHot(-1, 120);
			
		assertEquals(true, result2);
	}
	
	@Test
	public void testIcyHot3() {
		
		IcyHot icyHot = new IcyHot();
		
		boolean result3 = icyHot.icyHot(2, 120);
			
		assertEquals(false, result3);
	}
}
