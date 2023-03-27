package com.ParasoftHybridframework.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Industriesdrp {
	public WebDriver driver; 
	public Industriesdrp(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//a[text()='Industries']")
	WebElement Industries;
	
	@FindBy(xpath="//a[text()='Automotive']")
	WebElement Automotive;
	
	@FindBy(xpath="//a[text()='Civil Aviation']")
	WebElement CivilAviation;

	@FindBy(xpath="//a[text()='Finance']")
	WebElement Finance;
	
	@FindBy(xpath="//a[text()='Explore Products']")
	WebElement ExploreProducts;
	
	@FindBy(xpath="//a[text()='Government']")
	WebElement Government;
	
	
	public void ClickOnIndustries() {
		Actions act = new Actions(driver);
		act.moveToElement(Industries).build().perform();
	}

	public void ClickOnAutomotive() {
		driver.switchTo().activeElement();
		Automotive.click();
	}

	public void ClickOnCivilAviation() {
		driver.switchTo().activeElement();
		CivilAviation.click();
	}

	public void ClickOnFinance() {
		driver.switchTo().activeElement();
		Finance.click();
	}
	
	public void ClickOnGovernment() {
		driver.switchTo().activeElement();
		Government.click();
	}
	
	public void ClickOnExploreProducts() {
		driver.switchTo().activeElement();
		ExploreProducts.click();
		driver.navigate().back();
	}



}
