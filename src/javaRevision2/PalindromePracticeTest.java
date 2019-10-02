package javaRevision2;

import static org.junit.Assert.*;

import org.junit.Test;

public class PalindromePracticeTest {

	@Test
	public void testIsPalindrome() {
		PalindromePractice palindromePractice = new PalindromePractice();
				
		boolean result = palindromePractice.isPalindrome("hannah");
		
		assertEquals(true, result);
	}
	
	@Test
	public void testIsPalindrome2() {
		PalindromePractice palindromePractice = new PalindromePractice();
				
		boolean result2 = palindromePractice.isPalindrome("martin");
		
		assertEquals(false, result2);
	}
	
	@Test
	public void testIsPalindrome3() {
		PalindromePractice palindromePractice = new PalindromePractice();
				
		boolean result3 = palindromePractice.isPalindrome("Hannah");
		
		assertEquals(true, result3);
	}

}
