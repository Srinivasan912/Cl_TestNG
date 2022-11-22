package org.samples;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C {
	@Test(groups="regression")
	public void testC1() {
	System.out.println("Test C1");
	}
	@Test(groups="retest")
	public void testC2() {
	System.out.println("Test C2");
	Assert.assertTrue(false);
	}
	@Test(groups="smoke")
	public void testC3() {
	System.out.println("Test C3");
	}
}
