package com.ParasoftHybridframework.TestCases;

import org.testng.annotations.Test;

import com.ParasoftHybridframework.Pageobjects.BaseClass;
import com.ParasoftHybridframework.Pageobjects.ContactUsLink;
import com.ParasoftHybridframework.Pageobjects.Productsdrp;

public class TC_Productsdrp_007 extends BaseClass {
	@Test
	public void ParasoftJtest() {
		Productsdrp pd = new Productsdrp(driver);
		pd.ClickOnProducts();
		pd.ClickOnParasoftJtest();
		pd.ClickOnReqDemo();
		
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
	
	@Test
	public void products() {
		Productsdrp pd = new Productsdrp(driver);
		pd.ClickOnProducts();
		pd.ClickOnParasoftdotTEST();
		pd.ClickOnReqDemo();
		
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
	
	@Test
	public void ParasoftSOAtest() {
		Productsdrp pd = new Productsdrp(driver);
		pd.ClickOnProducts();
		pd.ClickOnParasoftSOAtest();		
		pd.ClickOnReqDemo();
		
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
