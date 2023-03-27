package com.ParasoftHybridframework.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomersLink {
	
	public WebDriver driver;
	
	public CustomersLink(WebDriver driver) {
		
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//a[text()='Customers']")
	WebElement customerslink;
	
	@FindBy(xpath="//a[text()='Read Case Studies']")
	WebElement ReadCaseStudy;
	
	@FindBy(xpath="//input[@type='text']")
	WebElement searchbox;
	
	@FindBy(xpath="//input[@name='_sf_submit']")
	WebElement searchbtn;


	public void ClickonCustomers() {
		customerslink.click();
	}

	public void ClickonCaseStudy() {
		ReadCaseStudy.click();
	}

	public void ClickonSearch() {
		searchbox.sendKeys("java");
	}


	public void Clickonsubmitbtn() {
		searchbtn.click();
	}







}
