package test1;

public class ListNode {
	int val;
	ListNode next;

	public ListNode(int x) {
		val = x;
	}
	
	public ListNode newNext(int y) {
		ListNode newNode = new ListNode(y);
		ListNode current = this;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;
		return this;
	}
}
