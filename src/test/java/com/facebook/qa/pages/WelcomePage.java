package com.facebook.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class WelcomePage extends BasePage{
	
	@FindBy(xpath=".//*[@data-testid='left_nav_item_John Tester']/div/span")
	WebElement link_profilePage;
	
	public WelcomePage(WebDriver driver) {
		super(driver);
	}
	
	public String getUsernameText(){
		return link_profilePage.getText();
	}
}