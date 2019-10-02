package javaRevision2;

import static org.junit.Assert.*;

import org.junit.Test;

public class BadStringPracticeTest {

	@Test
	public void testHasBad() {
		BadStringPractice badStringPractice = new BadStringPractice();
				
		boolean result = badStringPractice.hasBad("badxx");
		
		assertEquals(true, result);
	}

	@Test
	public void testHasBad2() {
		BadStringPractice badStringPractice = new BadStringPractice();
				
		boolean result2 = badStringPractice.hasBad("xbadxx");
		
		assertEquals(true, result2);
	}
	
	@Test
	public void testHasBad3() {
		BadStringPractice badStringPractice = new BadStringPractice();
				
		boolean result3= badStringPractice.hasBad("xxbadxx");
		
		assertEquals(false, result3);
	}
	
	@Test
	public void testHasBad4() {
		BadStringPractice badStringPractice = new BadStringPractice();
				
		boolean result4= badStringPractice.hasBad("Badxx");
		
		assertEquals(false, result4);
	}
}
