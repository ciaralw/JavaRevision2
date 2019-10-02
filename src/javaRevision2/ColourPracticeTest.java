package javaRevision2;

import static org.junit.Assert.*;

import org.junit.Test;

public class ColourPracticeTest {

	@Test
	public void testSeeColor() {
		ColourPractice colourPractice = new ColourPractice();
		
		String result = colourPractice.seeColor("redxx");
		
		assertEquals("red", result);
	}
	
	@Test
	public void testSeeColor2() {
		ColourPractice colourPractice = new ColourPractice();
		
		String result2 = colourPractice.seeColor("xxred");
		
		assertEquals("", result2);
	}
	
	@Test
	public void testSeeColor3() {
		ColourPractice colourPractice = new ColourPractice();
		
		String result3 = colourPractice.seeColor("bluexx");
		
		assertEquals("blue", result3);
	}
	
	@Test
	public void testSeeColor4() {
		ColourPractice colourPractice = new ColourPractice();
		
		String result4 = colourPractice.seeColor("Bluexx");
		
		assertEquals("", result4);
	}

}
