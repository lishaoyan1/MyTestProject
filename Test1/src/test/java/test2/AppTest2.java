package test2;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AppTest2 {
	Solution solution = new Solution();

	@Test
	public void test1() {
		String[] in = {"flower", "flow", "flight"};
		assertEquals("fl", solution.longestCommonPrefix(in));
	}

	@Test
	public void test2() {
		String[] in = {"dog", "racecar", "car"};
		assertEquals("", solution.longestCommonPrefix(in));
	}
}