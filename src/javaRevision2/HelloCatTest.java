package javaRevision2;

import static org.junit.Assert.*;

import org.junit.Test;

public class HelloCatTest {

	@Test
	public void testHiConcat() {
		String result = HelloCat.hiConcat("Bob");
		
		assertEquals("Hello Bob!", result);
	}
	
	@Test
	public void testHiConcat2() {
		String result2 = HelloCat.hiConcat("Alice");
		
		assertEquals("Hello Alice!", result2);
	}
	
	@Test
	public void testHiConcat3() {
		String result3 = HelloCat.hiConcat("X");
		
		assertEquals("Hello X!", result3);
	}

}
