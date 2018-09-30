package com.HEB.pages;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.HEB.utilities.Driver;

public class CouponsPage {
 WebDriver driver;
	  public CouponsPage() {
			PageFactory.initElements(Driver.getDriver(), this);
		}
	    
	@FindBy(xpath="//a[.='Select Digital Coupons']")
	public WebElement selectDigitalCouponsButton;
	
	@FindBy(xpath="//a[.='Select Coupon']")
	public List<WebElement> selectCoupons;
	
	
	public void clickElement(WebElement element) {
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
	}
	
	public void scrollDown() {
		((JavascriptExecutor)
				driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}
	
}
