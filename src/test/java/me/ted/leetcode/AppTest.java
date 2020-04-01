package me.ted.leetcode;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
		System.out.println("构造函数");
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		System.out.println("静态方法suite");
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		//assertTrue("失败了",false);
		System.out.println("testApp");
	}
	
	public void testApp2() {
		System.out.println("测试单元2");
	}
}
