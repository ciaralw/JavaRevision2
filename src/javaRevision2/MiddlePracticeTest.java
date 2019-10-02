package javaRevision2;

import static org.junit.Assert.*;

import org.junit.Test;

public class MiddlePracticeTest {

	@Test
	public void testMiddleTwo() {
		MiddlePractice middlePractice = new MiddlePractice();
		
		String result = middlePractice.middleTwo("string");
		
		assertEquals("ri", result);
	}
	
	@Test
	public void testMiddleTwo2() {
		MiddlePractice middlePractice = new MiddlePractice();
		
		String result2 = middlePractice.middleTwo("code");
		
		assertEquals("od", result2);
	}
	
	@Test
	public void testMiddleTwo4() {
		MiddlePractice middlePractice = new MiddlePractice();
		
		String result4 = middlePractice.middleTwo("Practice");
		
		assertEquals("ct", result4);
	}
	
	@Test
	public void testMiddleTwo3() {
		MiddlePractice middlePractice = new MiddlePractice();
		
		String result3 = middlePractice.middleTwo("abcdef");
		
		assertNotEquals("de", result3);
	}

}
