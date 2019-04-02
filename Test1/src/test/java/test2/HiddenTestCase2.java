package test2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class HiddenTestCase2 {
	Solution solution = new Solution();

	@Test
	public void test1() {
		String[] in = {"flower", "flower", "flower"};
		assertEquals("flower", solution.longestCommonPrefix(in));
	}

	@Test
	public void test2() {
		String[] in = {};
		assertEquals("", solution.longestCommonPrefix(in));
	}
	
	@Test
	public void test3() {
		String[] in = {"flower123", "flower123", "flower"};
		assertEquals("flower", solution.longestCommonPrefix(in));
	}
}
