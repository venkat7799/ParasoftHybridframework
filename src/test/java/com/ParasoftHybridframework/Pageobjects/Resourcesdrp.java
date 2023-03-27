package com.ParasoftHybridframework.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Resourcesdrp {
	public WebDriver driver;
	public Resourcesdrp(WebDriver driver) {
		
		PageFactory.initElements(driver,this);
		this.driver = driver;
	}
	
	@FindBy(xpath="//a[text()='Resources']")
	WebElement Resources;
	
	@FindBy(xpath="//a[text()='Analyst Research']")
	WebElement AnalystResearch;
	
	@FindBy(xpath="//a[text()='Blog']")
	WebElement Blog;
	
	@FindBy(xpath="//a[text()='Brochures']")
	WebElement Brochures;
	
	@FindBy(xpath="//a[text()='Case Studies']")
	WebElement CaseStudies;
	
	public void ClickonResources() {
		Actions act =new Actions(driver);
		act.moveToElement(Resources).build().perform();
	}
	
	public void ClickOnAnalystResearch() {
		driver.switchTo().activeElement();
		AnalystResearch.click();
		driver.navigate().back();
	}
	
	public void ClickOnBlog() {
		driver.switchTo().activeElement();
		Blog.click();
		driver.navigate().back();
	}
	
	public void ClickOnBrochures() {
		driver.switchTo().activeElement();
		Brochures.click();
		driver.navigate().back();
	}
	
	public void ClickOnCaseStudies() {
		driver.switchTo().activeElement();
		CaseStudies.click();
		driver.navigate().back();
	}
	
}
