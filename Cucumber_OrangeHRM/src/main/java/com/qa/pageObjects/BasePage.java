package com.qa.pageObjects;

import org.openqa.selenium.WebDriver;

import com.qa.factory.DriverFactory;

public class BasePage extends DriverFactory
{
	
	public static WebDriver classdriver;
	public AdminPage adminpage;
	public static LoginPage loginpage;
	
	public static void getUrl()
	{
		System.out.println(classdriver+ "class driver in base class");
	    DriverFactory.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

}
