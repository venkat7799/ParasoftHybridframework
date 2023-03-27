package com.ParasoftHybridframework.Pageobjects;

import java.util.List;

import org.apache.maven.surefire.shared.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class ContactUsLink {
	WebDriver driver;
	public ContactUsLink(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}
	
	@FindBy(xpath="//a[text()='Contact Us']")
	WebElement Contactus;
	
	@FindBy(xpath="//input[@type='email']")
	WebElement Email;
	
	@FindBy(xpath="//input[@name='firstname']")
	WebElement firstname;
	
	@FindBy(xpath="//input[@name='lastname']")
	WebElement lastname;
	
	@FindBy(xpath="//input[@name='company']")
	WebElement company;
	
	@FindBy(xpath="//input[@name='jobtitle']")
	WebElement jobTitle;
	
	@FindBy(xpath="//input[@name='phone']")
	WebElement phonenumber;
	
	@FindBy(xpath="//select[@name='country']")
	WebElement country;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submitbtn;
	
	
	public void ClickOnContactUs() {
		Contactus.click();
	}
	
	public void ClickOnEmail() {
		String email = RandomStringUtils.randomAlphanumeric(8)+"@gmail.com";
		Email.sendKeys(email);
		
	}
	
    public void ClickOnFirstname() {
    	firstname.sendKeys("venkat");
    }
	
    public void ClickOnlastname() {
    	lastname.sendKeys("venkey");
    }
	
    public void ClickOnCompany() {
    	company.sendKeys("tcs");
    }
	
    public void ClickOnjrole() {
    	jobTitle.sendKeys("QA");
    }
    
    public void ClickOnPhno() {
    	phonenumber.sendKeys("8247774343");
    }
	
    public void ClickOnCountry() {
    	Select slt = new Select(country);
    List<WebElement> list =	slt.getOptions();
   
    slt.selectByVisibleText("India");
    }
    
    public void submitbtn() {
    	submitbtn.click();
    }
}
