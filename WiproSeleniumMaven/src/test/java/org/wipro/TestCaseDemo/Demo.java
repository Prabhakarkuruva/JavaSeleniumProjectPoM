package org.wipro.TestCaseDemo;

import org.wipro.Browser.Browser;
import org.wipro.Pages.Page1;
import org.wipro.Pages.Page2;
import org.wipro.ScreenShot.Capture;

public class Demo {
public static void main(String[] args) throws Exception {
	Browser.openBrowser();
	Browser.navigateToUrl();
	Page1.enterusername("Admin");
	Capture.screenShot("username");
	Page1.enterpassword("admin123");
	if(Page1.Title().equals("OrangeHRM"))
	{
		System.out.println("Title matched with expected");
	}
	else
	{
		System.out.println("Title is not matched with expected");
		
	}
	Page1.click();
	
	if(Page2.Username().equals("manda user"))
	{
		System.out.println("user matched with expected");
	}
	else
	{
		System.out.println("user is not matched with expected");
		
	}
	Capture.screenShot("page2");
	Page2.optionclick("time");
	
	Browser.closeBrowser();
}

}












































//import org.wipro.Browser.Browser;
//import org.wipro.Pages.Page1;
////import org.wipro.Pages.Page2;
//public class Demo {
//	public static void main(String[] args) throws Exception {
//		  try {
//	            // Open the browser and navigate to the URL
//	            Browser.openBrowser();
//	            Browser.navigateToUrl(); // Navigate to the desired URL
//
//	            // Get the actual title of the page using Page1's title() method
//	            String actualTitle = Page1.title();
//
//	            // Define the expected title
//	            String expectedTitle = "OrangeHRM";
//
//	            // Compare the actual title with the expected title
//	            if (actualTitle.equals(expectedTitle)) {
//	                System.out.println("Pass");
//	            } else {
//	                System.out.println("Fail - Expected title: " + expectedTitle + ", but found: " + actualTitle);
//	            }
//
//	            // Close the browser after the test
//	            Browser.closeBrowser();
//
//	        } 
//		  catch (Exception e) {
//			e.printStackTrace();
//		}
//
//	}
//}
////		try {
////			Browser.openBrowser();
////			Browser.navigateToUrl();
////			Thread.sleep(3000);
////			Page1.userNameEnter("Admin");
////			Page1.passwordEnter("admin123");
////			Page1.clickLogin();
////			Thread.sleep(3000);
////			//Page2.selectChoice("Directory");
//////			Browser.closeBrowser();
////			
////		}catch(Exception e) {
////			e.printStackTrace();
////		}
////
////	}
//
//
