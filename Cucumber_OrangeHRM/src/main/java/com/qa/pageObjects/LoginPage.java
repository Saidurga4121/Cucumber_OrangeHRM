package com.qa.pageObjects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.factory.DriverFactory;


public class LoginPage extends BasePage
{
	  // public WebDriver classdriver;
	
	 public LoginPage(WebDriver localDriver) 
	 {	
		this.classdriver=localDriver;
		PageFactory.initElements(localDriver, this);
	 }
	 
//	 public LoginPage()
//	 {
//		 PageFactory.initElements(DriverFactory.getDriver(), this);
//	 }
	
    
    @FindBy(xpath="//input[@name='username']")
	WebElement email;
	
	@FindBy(xpath="//input[@name='password']")
	WebElement password;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement btnLogin;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[4]/p")
	WebElement forgotPwdLink;
	
    
    public String getLoginPageTitle()
	{
		return classdriver.getTitle();
	}
	
    public boolean isForgotPwdLinkExist() 
    {
		return forgotPwdLink.isDisplayed();
	}
    
    public void enterUserName(String username)
    {
    	 email.sendKeys(username);
    }
    
    public void enterPassword(String pwd)
    {
    	password.sendKeys(pwd);
    }
    
    public void clickOnLogin() 
    {
		btnLogin.click();
	}
    
    public AdminPage doLogin(String un, String pwd) throws InterruptedException 
    {
		System.out.println("login with: " + un + " and " + pwd);
		
		classdriver.findElement(By.xpath("//input[@name='username']")).sendKeys(un);
		Thread.sleep(1000);
		classdriver.findElement(By.xpath("//input[@name='password']")).sendKeys(pwd);
		Thread.sleep(1000);
		classdriver.findElement(By.xpath("//button[@type='submit']")).click();
		
		return new AdminPage(classdriver);
	}
    
	
	
	
	
}
