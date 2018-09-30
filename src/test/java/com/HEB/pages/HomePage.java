package com.HEB.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HEB.utilities.Driver;

public class HomePage {
	
	    public HomePage() {
			PageFactory.initElements(Driver.getDriver(), this);
		}
	    
	@FindBy(css="#LogIn")
	public WebElement loginButton;
	
	@FindBy(css="#login-email")
	public WebElement email;
	
	@FindBy(css="#reg-password")
	public WebElement password;
	
	@FindBy(css="#login-submit")
	public WebElement loginSubmit;
	
	@FindBy(xpath="//a[@id='myaccountSId']")
	public WebElement userName;
	
	@FindBy(xpath="//span[.='Coupons']")
	public WebElement coupons;
	
	
	

}
