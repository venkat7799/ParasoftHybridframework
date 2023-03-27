package com.ParasoftHybridframework.TestCases;

import org.testng.annotations.Test;

import com.ParasoftHybridframework.Pageobjects.BaseClass;
import com.ParasoftHybridframework.Pageobjects.Industriesdrp;

public class TC_Industriesdrp_008 extends BaseClass{
	@Test
	public void Automotive() {
		Industriesdrp id = new Industriesdrp(driver);
		id.ClickOnIndustries();
		id.ClickOnAutomotive();
		id.ClickOnExploreProducts();
	}
	@Test
	public void CivilAviation() {
		Industriesdrp id = new Industriesdrp(driver);
		id.ClickOnIndustries();
    	id.ClickOnCivilAviation();
		id.ClickOnExploreProducts();
	}
	@Test
	public void Finance() {
		Industriesdrp id = new Industriesdrp(driver);
		id.ClickOnIndustries();
    	id.ClickOnFinance();
		id.ClickOnExploreProducts();
	}
	@Test
	public void Government() {
		Industriesdrp id = new Industriesdrp(driver);
		id.ClickOnIndustries();
    	id.ClickOnGovernment();
		id.ClickOnExploreProducts();
	}

}


