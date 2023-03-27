package com.ParasoftHybridframework.TestCases;

import org.testng.annotations.Test;

import com.ParasoftHybridframework.Pageobjects.BaseClass;
import com.ParasoftHybridframework.Pageobjects.ContactUsLink;

public class TC_ContactUsLink_001 extends BaseClass{
	@Test
	public void contactus() {
		ContactUsLink cs = new ContactUsLink(driver);
		cs.ClickOnContactUs();
		cs.ClickOnEmail();
		cs.ClickOnFirstname();
		cs.ClickOnlastname();
		cs.ClickOnCompany();
		cs.ClickOnjrole();
		cs.ClickOnPhno();
		cs.ClickOnCountry();
		cs.submitbtn();
	}

}
