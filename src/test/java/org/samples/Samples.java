package org.samples;

import org.pages.LoginPage;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.utility.BaseClass;

public class Samples extends BaseClass {
	@BeforeClass
	private void beforeClass() {
		launchBrowser("Chrome");
		maximize();
		implicitwait(10);
		System.out.println("BeforeClass");
	}
	@BeforeMethod
	private void beforeMethod() {
	System.out.println("Before Methods");	
	}
	@AfterClass
	private void afterClass() {
	quit();
	}
	@AfterMethod
	private void afterMethod() {
		System.out.println("After Methods");
	}
//	@Parameters({"username","password"})
//	@Test
//	private void test1(String user,String pass) {
//		urlLaunch("https://www.facebook.com/");
//		LoginPage l=new LoginPage();
//		SoftAssert s =new SoftAssert();
//		sendkeys(l.getTxtUsername(), user);
//		s.assertEquals(getAttribute(l.getTxtUsername()),"Srinivasan", "Verify User Name");
//		sendkeys(l.getTxtPassword(), pass);
//		s.assertEquals(getAttribute(l.getTxtPassword()),"12345678", "Verify PassWord");
//		click(l.getBtnLogin());
//		System.out.println("Test 1");
//		s.assertAll();
//	}
	@Test(dataProvider="login",dataProviderClass=Datas.class)
	private void test2(String user,String pass) {
		urlLaunch("https://www.facebook.com/");
		LoginPage l=new LoginPage();
		SoftAssert s =new SoftAssert();
		sendkeys(l.getTxtUsername(), user);
		s.assertEquals(getAttribute(l.getTxtUsername()),"Srini", "Verify User Name");
		sendkeys(l.getTxtPassword(), pass);
		s.assertEquals(getAttribute(l.getTxtPassword()),"Vasan", "Verify PassWord");
		click(l.getBtnLogin());
		System.out.println("Test 1");
		s.assertAll();
	}
}
