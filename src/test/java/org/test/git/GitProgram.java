package org.test.git;

import org.pages.GitPages;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.utility.BaseClass;

public class GitProgram extends BaseClass {
@BeforeClass
private void beforeClass() {
	launchBrowser("Chrome");
	maximize();
	implicitwait(10);
}
@AfterClass
private void afterClass() {
	quit();
}
@Test
private void test1() {
urlLaunch("https://github.com/microsoft");
GitPages g = new GitPages();
click(g.getTxtReposities());

}
}
