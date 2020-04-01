package me.ted.leetcode._1_two_sum;

import junit.framework.TestCase;
import me.ted.leetcode._1_two_sum.TwoSum;

public class TwoSumTest extends TestCase {
	
	public void testTwoSum() {
		int[] nums = { 0, 4, 3, 0 };
		int target = 0;
		int[] result = new TwoSum().twoSum(nums, target);
		System.out.println("输出结果：");
		StringBuilder sb = new StringBuilder("[");
		for (int i = 0; i < result.length; i++) {
			sb.append(result[i]).append(",");
		}
		sb.deleteCharAt(sb.length() - 1).append("]");
		System.out.println(sb.toString());
	}

}
