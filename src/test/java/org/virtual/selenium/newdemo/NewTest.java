package org.virtual.selenium.newdemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  public void f() {
	  System.out.println("hello");
	
//	  System.setProperty("webdriver.chrome.driver", "/home/rahul/Downloads/chrome/chromedriver");
	  System.out.println("hello1");
		WebDriver driver=new ChromeDriver();
		 System.out.println("hello2");
			driver.get("http://kushala.org/workspace/virtual-university/");
	  
  }
}
