package com.HEB.stepdefs;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.HEB.pages.CouponsPage;
import com.HEB.pages.HomePage;
import com.HEB.utilities.BrowserUtils;
import com.HEB.utilities.Driver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HEBCouponsStepDefs {
	WebDriver driver;
	HomePage homePage= new HomePage();
	CouponsPage cpons=new CouponsPage();
   JavascriptExecutor js=(JavascriptExecutor) driver;
	
	@Given("the user is on home page and clicks on login button")
	public void the_user_is_on_home_page_and_clicks_on_login_button() {
		BrowserUtils.waitFor(3);
	   homePage.loginButton.click();
	}

	@When("the user logs in with email {string} and password {string}")
	public void the_user_logs_in_with_email_and_password(String email, String password) {
		BrowserUtils.waitFor(2);
	   homePage.email.sendKeys(email);
		BrowserUtils.waitFor(2);
	   homePage.password.sendKeys(password);
		BrowserUtils.waitFor(2);
	   homePage.loginSubmit.click();
	}

	@Then("the user should verify if user name is displayed on home page and clicks on coupons link")
	public void the_user_should_verify_if_user_name_is_displayed_on_home_page_and_clicks_on_coupons_link() {
		BrowserUtils.waitFor(1);
	   String actual="Hi, Gulnoza";
		BrowserUtils.waitFor(2);
	   Assert.assertEquals(actual,homePage.userName.getText());
		BrowserUtils.waitFor(1);
	   homePage.coupons.click();
	}

	@When("the user clicks Select Digital Coupons button from Coupons page")
	public void the_user_clicks_Select_Digital_Coupons_button_from_Coupons_page() {
		BrowserUtils.waitFor(3);
	   cpons.selectDigitalCouponsButton.click();
	}

	@Then("the user should click on all select coupon buttons on Digital Coupons page")
	public void the_user_should_click_on_all_select_coupon_buttons_on_Digital_Coupons_page() {
		
	
		BrowserUtils.waitFor(3);
		
		int totalCoupons = cpons.selectCoupons.size();
	    List<WebElement>digitalCoupons=cpons.selectCoupons;
	   for(WebElement eachCoupons:digitalCoupons) {
		   eachCoupons.click();
		
	   }
	   BrowserUtils.waitFor(10);
	   JavascriptExecutor js=(JavascriptExecutor)Driver.getDriver();
	   js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	  
		BrowserUtils.waitFor(3);
	   System.out.println(totalCoupons+" coupons selected");
		
	}



}
