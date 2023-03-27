package com.ParasoftHybridframework.TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.ParasoftHybridframework.Pageobjects.BaseClass;
import com.ParasoftHybridframework.Pageobjects.SupportLink;

public class TC_SupportLink_005 extends BaseClass{
	@Test
	public void supportlink() {
		SupportLink sl = new SupportLink(driver);
		sl.ClickOnSupport();
		Assert.assertEquals(driver.getTitle(), "Automated Testing to Deliver Superior Quality Software | Parasoft");
	
}

}
