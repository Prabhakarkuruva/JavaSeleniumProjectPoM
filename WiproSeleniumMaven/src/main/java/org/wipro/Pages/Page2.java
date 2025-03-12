package org.wipro.Pages;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.wipro.Browser.Browser;
import org.wipro.Locators.Page2Objects;

public class Page2 extends Browser {
		public static String Username()
		{
			return Page2Objects.username().getText();
		}
		public static void optionclick(String str) 
		{
			try{
				List<WebElement> list=Page2Objects.menuelements();
				for(WebElement e:list)
				{
					if(e.getText().equalsIgnoreCase(str))
					{	e.click();
						break; }
				}
				}
			
			catch(Exception E)
			{
				System.out.println("Click :"+E);
			}	
		}
		
		public static String MenuName()
		{
			return Page2Objects.menuName().getText();
		}
}







//public class Page2 extends Browser {
//	public static void selectChoise(String choise) {
//		/*
//		 * WebElement
//		 * search=driver.findElement(By.xpath("//input[@placeholder='Search']"));
//		 * search.click(); search.sendKeys(choise); WebElement
//		 * clicking=driver.findElement(By.
//		 * xpath("//span[@class='oxd-text oxd-text--span oxd-main-menu-item--name']"));
//		 * act.click(clicking).build().perform();
//		 */
//		List<WebElement> list = Page2Objects.menuelements();
//
//		for (int i = 0; i < list.size(); i++) {
//
//			if (list.get(i).getText().equalsIgnoreCase(choise))
//
//			{
//
//				list.get(i).click();
//
//				break;
//
//			}
//
//		}
//		
//
//	}
//	 public static void userBox(String name) {
//		 String user=Page2Objects.username().getText();
//	    	if(name.equalsIgnoreCase(user))
//	    	{
//	    		System.out.println("pass");
//	    	}
//	    	else
//	    		System.out.println("Fail");
//
//	 }
//	 
//	 
//	 
//	 public static String MenuName()
//		{
//			return Page2Objects.menuName().getText();
//		}
//			
//
////	 public static String menuName() {
////		 return Page2Objects.getText();
////	 }
//	    
//
//}