package test1;

/**
 * 两数相加
 *	输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 *	输出：708
 *	原因：342 + 465 = 807
 */
public class Solution {
    public int addTwoNumbers(ListNode l1, ListNode l2) {
    	int sum1 = sum(l1);
    	int sum2 = sum(l2);
        return sum1 + sum2;
    }

	private int sum(ListNode l1) {
		int sum = 0;
    	int i = 0;
    	ListNode currentNode = l1;
    	do {
			sum += pow(i) * currentNode.val;
			i++;
			currentNode = currentNode.next;
		} while (currentNode != null);
    	return sum;
	}
    
    private int pow(int exponent) {
    	int result = 1;
    	for (int i = 0; i < exponent; i++) {
			result = result * 10;
		}
    	return result;
    }
}
