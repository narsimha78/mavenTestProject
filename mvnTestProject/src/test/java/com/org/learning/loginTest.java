package com.org.learning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class loginTest {
	
	@Test
	public void Login()
	{
		System.out.println("this is first program");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com.au/?gfe_rd=cr&ei=roo1V8FOxs3yB5KcgvAH&gws_rd=ssl");
	}

}
