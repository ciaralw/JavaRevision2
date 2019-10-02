package javaRevision2;

import static org.junit.Assert.*;

import org.junit.Test;

public class BracketsTest {

	@Test
	public void testBalancedBrackets() {
		boolean result = Brackets.balancedBrackets("[()]"); 
		
		assertEquals(true, result);
	}
	
	@Test
	public void testBalancedBrackets2() {
		boolean result2 = Brackets.balancedBrackets("{[]}"); //([()]) {[}]
		
		assertEquals(true, result2);
	}
	
	@Test
	public void testBalancedBrackets3() {
		boolean result3 = Brackets.balancedBrackets("[]{}()");
		
		assertEquals(true, result3);
	}
	
	@Test
	public void testBalancedBrackets4() {
		boolean result4 = Brackets.balancedBrackets("[)[)");
		
		assertEquals(false, result4);
	}
	
	@Test
	public void testBalancedBrackets5() {
		boolean result5 = Brackets.balancedBrackets("()]()");
		
		assertEquals(false, result5);
	}

}
