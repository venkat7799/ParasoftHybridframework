package com.ParasoftHybridframework.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupportLink {
	public WebDriver driver ;
	public SupportLink(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Support']")
	WebElement support;
	
	public void ClickOnSupport() {
		support.click();
	}
	
}
