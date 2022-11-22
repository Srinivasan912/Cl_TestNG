package org.samples;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class A {
	@Test(groups="smoke")
	public void testA1() {
	System.out.println("Test A1");
	}
	@Test(groups="regression")
	public void testA2() {
	System.out.println("Test A2");
	}
	@Test(groups="retest")
	public void testA3() {
	System.out.println("Test A3");
	}

}
