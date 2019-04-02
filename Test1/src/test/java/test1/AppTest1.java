package test1;

import static org.junit.Assert.*;

import org.junit.Test;

import test1.ListNode;
import test1.Solution;

public class AppTest1 {

	Solution solution = new Solution();
	@Test
	public void test1() {
		ListNode listNode1 = new ListNode(2).newNext(4).newNext(3);
		ListNode listNode2 = new ListNode(5).newNext(6).newNext(4);
		
		assertEquals(807, solution.addTwoNumbers(listNode1, listNode2));
	}

}
