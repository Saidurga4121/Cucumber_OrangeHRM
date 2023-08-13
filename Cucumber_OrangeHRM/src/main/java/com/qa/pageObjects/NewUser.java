package com.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NewUser extends BasePage
{
	public NewUser(WebDriver localDriver) 
	 {	
		this.classdriver=localDriver;
		PageFactory.initElements(localDriver, this);
	 }
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/div/div[2]/div/div")
    WebElement empname;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[4]/div/div[2]/input")
	WebElement username;
	
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button")
	WebElement clickAdd;
	
	
	public void clickAdd() throws InterruptedException
	{
		Thread.sleep(1000);
		clickAdd.click();
	}
	
	public void enterEmpName(String empName)
	{
		empname.sendKeys(empName);
	}
	
	public void enterUserName(String userName)
	{
		username.sendKeys(userName);
	}
	
	
	
	
	
	
	
}
