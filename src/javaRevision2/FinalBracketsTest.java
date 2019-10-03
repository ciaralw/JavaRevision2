package javaRevision2;

import static org.junit.Assert.*;

import org.junit.Test;

public class FinalBracketsTest {

	@Test
	public void testBalancedBrackets() {
		boolean result = FinalBrackets.balancedBrackets2("[()]"); 
		
		assertEquals(true, result);
	}
	
	@Test
	public void testBalancedBrackets2() {
		boolean result2 = FinalBrackets.balancedBrackets2("{[]}"); //([()]) {[}]
		
		assertEquals(true, result2);
	}
	
	@Test
	public void testBalancedBrackets3() {
		boolean result3 = FinalBrackets.balancedBrackets2("[]{}()");
		
		assertEquals(true, result3);
	}
	
	@Test
	public void testBalancedBrackets4() {
		boolean result4 = FinalBrackets.balancedBrackets2("[)[)");
		
		assertEquals(false, result4);
	}
	
	@Test
	public void testBalancedBrackets5() {
		boolean result5 = FinalBrackets.balancedBrackets2("()]()");
		
		assertEquals(false, result5);
	}
	
	@Test
	public void testBalancedBrackets6() {
		boolean result6 = FinalBrackets.balancedBrackets2("{[}]");
		
		assertEquals(false, result6);
	}

	@Test
	public void testBalancedBrackets7() {
		boolean result7 = FinalBrackets.balancedBrackets2("[)(]");
		
		assertEquals(false, result7);
	}
	
	@Test
	public void testBalancedBrackets8() {
		boolean result8 = FinalBrackets.balancedBrackets2("(({[]}))");
		
		assertEquals(true, result8);
	}
	
	@Test
	public void testBalancedBrackets9() {
		boolean result9 = FinalBrackets.balancedBrackets2("{plp(uuuu)ddd}");
		
		assertEquals(true, result9);
	}
}
