package com.ParasoftHybridframework.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Productsdrp {
	WebDriver driver;
	
	public Productsdrp(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}

	@FindBy(xpath="//a[text()='Products']")
	WebElement Products;
	
	@FindBy(xpath="//a[text()='Parasoft Jtest']")
	WebElement ParasoftJtest;
	
	@FindBy(xpath="//a[text()='Request a Demo']")
	WebElement RequestDemo;
	
	@FindBy(xpath="//a[text()='Parasoft dotTEST']")
	WebElement ParasoftdotTEST;
	
	@FindBy(xpath="//a[text()='Parasoft SOAtest']")
	WebElement ParasoftSOAtest;
	
	public void ClickOnProducts() {
		Actions act = new Actions(driver);
		act.moveToElement(Products).build().perform();
	}
	
	public void ClickOnParasoftJtest() {
		ParasoftJtest.click();
	}
	
	public void ClickOnReqDemo() {
		Actions act = new Actions(driver);
		act.moveToElement(RequestDemo).click().build().perform();
		driver.navigate().back();
	}
	
	public void ClickOnParasoftdotTEST() {
		ParasoftdotTEST.click();
	}
	
	public void ClickOnParasoftSOAtest() {
		ParasoftSOAtest.click();
	}
}
