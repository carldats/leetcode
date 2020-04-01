package me.ted.leetcode._2_add_two_numbers;

import java.util.LinkedList;
import java.util.List;

import junit.framework.TestCase;
import me.ted.leetcode._2_add_two_numbers.AddTwoNumbers;
import me.ted.leetcode._2_add_two_numbers.ListNode;

public class AddTwoNumbersTest extends TestCase {

	public void testAddTwoNumbers() {
		ListNode l1 = arrayToListNode(new Integer[] { 4, 5, 6, 6, 3, 8, 0, 1 });
		ListNode l2 = arrayToListNode(new Integer[] { 7, 8 });
		new AddTwoNumbers().addTwoNumbers(l1, l2);

	}

	// 将数组转换成ListNode
	private ListNode arrayToListNode(Integer[] integers) {

		List<Integer> list = new LinkedList<Integer>();
		for (Integer integer : integers) {
			list.add(integer);
		}
		ListNode listNode = listToListNode(list);
		return listNode;
	}

	// 使用递归循环拼接子节点
	private ListNode listToListNode(List<Integer> list) {
		if (list != null && list.size() > 0) {
			ListNode listNode = new ListNode(list.get(0));
			list.remove(0);
			listNode.next = listToListNode(list);
			return listNode;
		} else {
			return null;
		}
	}

	// 打印ListNode
	public static void printListNode(ListNode node) {
		if (node != null && node.next != null) {
			System.out.print(node.val + "->");
			printListNode(node.next);
		} else if (node != null) {
			System.out.println(node.val);
		}
	}
}
