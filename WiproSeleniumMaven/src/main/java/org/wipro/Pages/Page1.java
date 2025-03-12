package org.wipro.Pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.wipro.Browser.Browser;
import org.wipro.Locators.Page1Objects;
import org.wipro.ScreenShot.Capture;

import com.aventstack.extentreports.Status;


public class Page1 extends Browser{
	public static String Title() throws InterruptedException
	{
		extent.attachReporter(reporter);
	Logger1=extent.createTest("Title");
	Logger1.log(Status.INFO, "Screenshot");
	Thread.sleep(5000);
	Logger1.addScreenCaptureFromPath(Capture.screenShot("Title"));
	extent.flush();

		return driver.getTitle();
	}
	public static void enterusername(String str) 
	{
		try 
		{	
				Page1Objects.username().sendKeys(str);
		}
		catch(Exception E)
		{
			System.out.println("Username :"+E);
		}
		
	}
	public static void enterpassword(String str) 
		{
			try
			{
				Page1Objects.password().sendKeys(str);
			}
			catch(Exception E)
			{
				System.out.println("Password :"+E);
			}
			
			
		}
	public static void click() 
	{
		try
		{
			Page1Objects.login().click();
		}
		catch(Exception E)
		{
			System.out.println("Click :"+E);
		}
	}
}







//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.wipro.Browser.Browser;
//import org.wipro.Locators.Page1Objects;
//
//public class Page1 extends Browser{
//	public static String Title()
//	{
//		return driver.getTitle();
//	}
//	public static void enterusername(String str) 
//	{
//		try 
//		{	
//				Page1Objects.username().sendKeys(str);
//		}
//		catch(Exception E)
//		{
//			System.out.println("Username :"+E);
//		}
//		
//	}
//	public static void enterpassword(String str) 
//		{
//			try
//			{
//				Page1Objects.password().sendKeys(str);
//			}
//			catch(Exception E)
//			{
//				System.out.println("Password :"+E);
//			}
//			
//			
//		}
//	public static void click() 
//	{
//		try
//		{
//			Page1Objects.login().click();
//		}
//		catch(Exception E)
//		{
//			System.out.println("Click :"+E);
//		}
//	}
//}

//public class Page1 extends Browser {
//	
	
//	 public static void userNameEnter(String username) {
//       // Find the username field and enter the username
//       driver.findElement(By.id("username")).sendKeys(username);
//   }
//
//   public static void passwordEnter(String password) {
//       // Find the password field and enter the password
//       driver.findElement(By.id("password")).sendKeys(password);
//   }
//
//   public static void clickLogin() {
//       // Find the login button and click it
//       driver.findElement(By.id("loginButton")).click();
//   }

   // Get the title of the page

	    // Method to get the title of the page
//   public static String title() {
//       return Browser.getTitle(); 
//   }
//       
//      
	
//	
//	
//		public static void userNameEnter(String username) {
//			WebElement usernameField=Page1Objects.adminText();
//			usernameField.sendKeys(username);
//		}
//		public static void passwordEnter(String password) {
//			WebElement passwordField=Page1Objects.passwordText();
//			passwordField.sendKeys(password);
//		}
//		public static void clickLogin() {
//			WebElement loginButton=Page1Objects.loginButton();
//			loginButton.click();
//		}
//   }
//
//
