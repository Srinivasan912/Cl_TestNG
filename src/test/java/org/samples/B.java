package org.samples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class B {
	@Test(groups="retest",retryAnalyzer=WithKnownFailed.class)
	public void testB1() {
	System.out.println("Test B1");
	Assert.assertTrue(false);
	}
	@Test(groups="smoke")
	public void testB2() {
	System.out.println("Test B2");
	}
	@Test(groups="regression")
	public void testB3() {
	System.out.println("Test B3");
	}
}
