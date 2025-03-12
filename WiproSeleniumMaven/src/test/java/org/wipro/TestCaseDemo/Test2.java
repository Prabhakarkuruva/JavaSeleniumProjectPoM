package org.wipro.TestCaseDemo;


import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.wipro.Browser.Browser;
import org.wipro.Excel.Login;
import org.wipro.Pages.Page1;
import org.wipro.Pages.Page2;


public class Test2 {
	@BeforeMethod
	public void openbrowser()
	{
		Browser.init("Testcase2Report");
		Browser.openBrowser();
		Browser.navigateToUrl();
		
	}
	
	@DataProvider(name="dp1")
	public Object[][] data() throws Exception
	{
		Object[][] obj=Login.readExcel(0);
		return obj;
		
	}
	
	@Test(dataProvider = "dp1")
	public void Testloginbutton(String name,String password,String expected)
	{
		Page1.enterusername(name);
		Page1.enterpassword(password);
		Page1.click();
		Assert.assertEquals(Page2.MenuName(),expected);


	}
	
	@AfterMethod
	public void closebrowser() throws InterruptedException
	{
		Thread.sleep(5000);
		Browser.closeBrowser();
	}


}


























//import org.testng.Assert;
//import org.testng.Reporter;
//import org.testng.annotations.AfterMethod;
//import org.testng.annotations.AfterTest;
//import org.testng.annotations.BeforeMethod;
//import org.testng.annotations.BeforeTest;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//import org.wipro.Browser.Browser;
//import org.wipro.Excel.Login;
//import org.wipro.Pages.Page1;
//import org.wipro.Pages.Page2;
//
//public class Test2 {
//	@BeforeMethod
//	public void openbrowser()
//	{
//		Browser.openBrowser();
//		Browser.navigateToUrl();
//		
//	}
//	
//	@DataProvider(name="dp1")
//	public Object[][] data() throws Exception
//	{
//		Object[][] obj=Login.readExcel(0);
//		return obj;
//		
//	}
//	
//	@Test(dataProvider = "dp1")
//	public void Testloginbutton(String name,String password,String expected)
//	{
//		Page1.enterusername(name);
//		Page1.enterpassword(password);
//		Page1.click();
//		Assert.assertEquals(Page2.MenuName(),expected);
//
//
//	}
//	
//	@AfterMethod
//	public void closebrowser() throws InterruptedException
//	{
//		Thread.sleep(5000);
//		Browser.closeBrowser();
//	}
//
//
//}
//



























//public class Test2 {
//	@BeforeMethod
//	public void open() throws Exception {
//		Browser.openBrowser();
//		Browser.navigateToUrl();
//	}
////	@DataProvider(name="name")
////	public Object[][] data(){
////		Object[][] obj=logindat
////		
////	}
//	
////	@Test
////	public void login() throws InterruptedException {
////		Thread.sleep(2000);
////		Page1.userNameEnter("Admin");
////		
////		Page1.passwordEnter("admin123");
////		
////		Page1.clickLogin();
////		Assert.assertTrue(true);
////	}
//	
//	@AfterMethod
//	public void closeBrowser() {
//		Browser.closeBrowser();
//	}
//
//}
