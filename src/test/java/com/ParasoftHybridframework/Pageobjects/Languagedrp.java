package com.ParasoftHybridframework.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Languagedrp {
	public WebDriver driver;
	public Languagedrp(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//select[@class='gt_selector notranslate']")
	WebElement language;
	
	public void ClickOnLanguage() {
	 Select slt = new Select(language);
	slt.selectByIndex(2);
	}
}
