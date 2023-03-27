package com.ParasoftHybridframework.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ParasoftHybridframework.Pageobjects.BaseClass;
import com.ParasoftHybridframework.Pageobjects.CustomersLink;

public class TC_CustomersLink_003 extends BaseClass{
	@Test
	public void customers() {
		CustomersLink cs = new CustomersLink(driver);
		cs.ClickonCustomers();
		cs.ClickonCaseStudy();
		cs.ClickonSearch();
		cs.Clickonsubmitbtn();
		
		System.out.println(driver.getTitle());
		
		if(driver.getPageSource().contains("Software Testing Help From the Experts | Parasoft Resources")) {
			Assert.assertTrue(true);
		}else {
			Assert.assertTrue(false);
		}
		
	}

}
