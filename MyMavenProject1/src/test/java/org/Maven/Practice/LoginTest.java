package org.Maven.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void LoginFuntion() throws InterruptedException{
		
		System.out.println("Login Fuction to access email account");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://greatandhra.com");
		//greatandhra website page should open 
		
		Thread.sleep(5000L);
		driver.close();
	}

}
