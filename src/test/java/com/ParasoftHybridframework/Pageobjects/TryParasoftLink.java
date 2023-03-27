package com.ParasoftHybridframework.Pageobjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class TryParasoftLink { 
	
	public WebDriver driver ;
	public TryParasoftLink(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	
	@FindBy(xpath="//a[text()='Try Parasoft']")
	WebElement trysoftLink;
	
	@FindBy(xpath="//li[@class='sf-field-taxonomy-solutions card']")
	WebElement Solutionsdrpdwn;
	
	@FindBy(xpath="//li[@class='sf-level-0 sf-item-274']")
	WebElement solutionOption;
	
	@FindBy(xpath="//li[@class='sf-field-taxonomy-industry card']")
	WebElement industriesdrpdwn;
	
	@FindBy(xpath="//li[@class='sf-level-0 sf-item-330']")
	WebElement industriesOption;
	
	public void ClickOnTrysoft() {
		trysoftLink.click();
	}
	
	public void ClickOnSolutions() {
		Solutionsdrpdwn.click();
	}
	
	public void ClickOnSolutionsOption() {
		solutionOption.click();
	}
	
	public void ClickOnIndustries() throws InterruptedException {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(900,900)");
		Thread.sleep(3000);
		industriesdrpdwn.click();
	}
	
	public void ClickOnIndustriesOPtion() {
		industriesOption.click();
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
