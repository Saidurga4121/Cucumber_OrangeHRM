package com.qa.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage 
{
	public WebDriver classdriver;
	
	public AdminPage(WebDriver localdriver) {
		this.classdriver = localdriver;
		PageFactory.initElements(localdriver, this);
	}
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[1]/a")
	WebElement clickAdmin;
	
	@FindBy(xpath="//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/input")
	WebElement enterUsername;
	
	@FindBy(xpath="//button[@type='submit']")
	WebElement searchbtn;
	
	
	
	public String getAdminPageTitle() 
	{
		return classdriver.getTitle();
	}
	
	public void clickAdmin()
	{
		clickAdmin.click();
	}
	
	public void enterUsername(String role)
	{
		enterUsername.sendKeys(role);
	}
	
	public void searchbtn()
	{
		searchbtn.click();
	}

}
