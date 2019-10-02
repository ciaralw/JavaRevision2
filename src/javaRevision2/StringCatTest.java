package javaRevision2;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringCatTest {

	@Test
	public void test() {

		String result = StringCat.concatenate("Bob", "Bobson");
		
		assertEquals("Bob Bobson", result);
	}
	
	@Test
	public void test2() {

		String result2 = StringCat.concatenate("Jim", "Jimson");
		
		assertEquals("Jim Jimson", result2);
	}
	
	@Test
	public void test3() {

		String result3 = StringCat.concatenate("Bob", "Bobson");
		
		assertNotEquals("BobBobson", result3);
	}

}
