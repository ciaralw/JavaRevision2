package javaRevision2;

import static org.junit.Assert.*;

import org.junit.Test;

public class SomeStringPracticeTest {

	@Test
	public void testEveryNth() {
		SomeStringPractice someStringPractice = new SomeStringPractice();
				
		String result = someStringPractice.everyNth("Miracle", 2);
		
		assertEquals("Mrce", result);
	}

	@Test
	public void testEveryNth2() {
		SomeStringPractice someStringPractice = new SomeStringPractice();
				
		String result2 = someStringPractice.everyNth("abcdefg", 2);
		
		assertEquals("aceg", result2);
	}
	
	@Test
	public void testEveryNth3() {
		SomeStringPractice someStringPractice = new SomeStringPractice();
				
		String result3 = someStringPractice.everyNth("abcdefg", 3);
		
		assertEquals("adg", result3);
	}
	
	@Test
	public void testEveryNth4() {
		SomeStringPractice someStringPractice = new SomeStringPractice();
				
		String result4 = someStringPractice.everyNth("bobobob", 2);
		
		assertNotEquals("bbbo", result4);
	}
}
