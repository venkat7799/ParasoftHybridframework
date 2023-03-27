package com.ParasoftHybridframework.Pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SolutionsDrpdwn {
	
	public WebDriver driver;
	
	public SolutionsDrpdwn(WebDriver driver) {
		PageFactory.initElements(driver, this);
		 this.driver=driver;
	}
	
	@FindBy(xpath="//a[text()='Solutions']")
	WebElement SolutionLink;
	
	@FindBy(xpath="//a[@title='API Testing']")
	WebElement APITesting;
	
	@FindBy(xpath="//a[@title='API Security Testing']")
	WebElement SecurityTesting;
	
	@FindBy(xpath="//a[@title='Code Coverage']")
	WebElement CodeCoverage;
	
	@FindBy(xpath="//a[@title='Unit Testing']")
	WebElement UnitTesting;
	
	
	public void ClickOnSolutions() {
		Actions act = new Actions(driver);
		act.moveToElement(SolutionLink).build().perform();
	}
	
	public void ClickOnAPITesting() {
		driver.switchTo().activeElement();
		APITesting.click();	
		driver.navigate().back();
	}
	
	public void ClickOnSecurityTesting() {
		driver.switchTo().activeElement();
		SecurityTesting.click();
		driver.navigate().back();
	}
	
	public void CliclOnCodeCoverage() {
		driver.switchTo().activeElement();
		CodeCoverage.click();
		driver.navigate().back();
		}
	
	public void ClickOnUnitTesting() {
		driver.switchTo().activeElement();
		UnitTesting.click();
	}
	
		
}



