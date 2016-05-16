package org.Maven.Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {
	
	@Test
	public void LoginFuntion(){
		
		System.out.println("Login Fuction to access email account");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://greatandhra.com");
	}

}
