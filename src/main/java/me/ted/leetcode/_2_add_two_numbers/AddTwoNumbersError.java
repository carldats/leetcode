package me.ted.leetcode._2_add_two_numbers;

import java.util.ArrayList;
import java.util.Collections;

/**
 * You are given two non-empty linked lists representing two non-negative
 * integers. The digits are stored in reverse order and each of their nodes
 * contain a single digit. Add the two numbers and return it as a linked list.
 * 
 * You may assume the two numbers do not contain any leading zero, except the
 * number 0 itself.
 * 
 * Example:
 * 
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4) Output: 7 -> 0 -> 8 Explanation: 342 +
 * 465 = 807.
 * 
 * @author 208
 * @URL https://leetcode.com/problems/add-two-numbers/
 */
public class AddTwoNumbersError {
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ArrayList<Integer> l1Arr = getDigits(l1, new ArrayList<Integer>());
		Collections.reverse(l1Arr);
		Long l1Int = Long.valueOf(convertInt(l1Arr));
		ArrayList<Integer> l2Arr = getDigits(l2, new ArrayList<Integer>());
		Collections.reverse(l2Arr);
		Long l2Int = Long.valueOf(convertInt(l2Arr));
		Long resultInt = l1Int + l2Int;

		ArrayList<Integer> resultArrayList = convertArrayList(resultInt);
		Collections.reverse(resultArrayList);
		ListNode result = arrayList2ListNode(resultArrayList);
		return result;
	}

	public static ListNode arrayList2ListNode(ArrayList<Integer> arr) {
		if(arr==null) {
			return null;
		}
		return setListNode(arr, new ListNode(arr.get(arr.size() - 1)));

	}
	public static ListNode setListNode(ArrayList<Integer> arrList, ListNode lastNode) {
		if (arrList != null && arrList.size()>1) {
			arrList.remove(arrList.size()-1);
			ListNode listNode = new ListNode(arrList.get(arrList.size()-1));
			listNode.next=lastNode;
			return setListNode(arrList, listNode);
		}
		return lastNode;
	}

	public static ArrayList<Integer> convertArrayList(Long number) {
		StringBuffer sb = new StringBuffer(number + "");
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (int i = 0; i < sb.length(); i++) {
			result.add(Integer.valueOf(sb.charAt(i) + ""));
		}
		return result;
	}

	public static String convertInt(ArrayList<Integer> list) {
		StringBuffer sb = new StringBuffer();
		if (list != null) {
			for (Integer ele : list) {
				sb.append(ele);
			}
		}
		return sb.toString();
	}

	public static ArrayList<Integer> getDigits(ListNode listNode, ArrayList<Integer> temp) {
		if (listNode != null) {
			temp.add(listNode.val);
			if (listNode.next != null) {
				getDigits(listNode.next, temp);
			}
		}
		return temp;
	}
	// -----------------------------------------------------------

	public static void main(String[] args) {
		ListNode l1 = arrayList2ListNode(convertArrayList(9L));
		printResult(l1);
		ListNode l2 = arrayList2ListNode(convertArrayList(1999999999L));
		printResult(l2);

		ListNode result = addTwoNumbers(l1, l2);

		printResult(result);
	}

	public static void printResult(ListNode listNode) {
		if (listNode != null) {
			System.out.print(listNode.val + "->");
			if (listNode.next != null) {
				printResult(listNode.next);
			} else {
				System.out.println();
			}
		}

	}
}

