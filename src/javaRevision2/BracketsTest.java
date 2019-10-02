package javaRevision2;

import static org.junit.Assert.*;

import org.junit.Test;

public class BracketsTest {

	@Test
	public void testBalancedBrackets() {
		boolean result = Brackets.balancedBrackets2("[()]"); 
		
		assertEquals(true, result);
	}
	
	@Test
	public void testBalancedBrackets2() {
		boolean result2 = Brackets.balancedBrackets2("{[]}"); //([()]) {[}]
		
		assertEquals(true, result2);
	}
	
	@Test
	public void testBalancedBrackets3() {
		boolean result3 = Brackets.balancedBrackets2("[]{}()");
		
		assertEquals(true, result3);
	}
	
	@Test
	public void testBalancedBrackets4() {
		boolean result4 = Brackets.balancedBrackets2("[)[)");
		
		assertEquals(false, result4);
	}
	
	@Test
	public void testBalancedBrackets5() {
		boolean result5 = Brackets.balancedBrackets2("()]()");
		
		assertEquals(false, result5);
	}
	
	@Test
	public void testBalancedBrackets6() {
		boolean result6 = Brackets.balancedBrackets2("{[}]");
		
		assertEquals(false, result6);
	}

	@Test
	public void testBalancedBrackets7() {
		boolean result7 = Brackets.balancedBrackets2("[)(]");
		
		assertEquals(false, result7);
	}
}
