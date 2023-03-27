package com.ParasoftHybridframework.TestCases;

import org.testng.annotations.Test;

import com.ParasoftHybridframework.Pageobjects.BaseClass;
import com.ParasoftHybridframework.Pageobjects.TryParasoftLink;

public class TC_TryParasoftLink_002 extends BaseClass{
	@Test()
	public void tryparasoft() throws InterruptedException {
		TryParasoftLink tp = new TryParasoftLink(driver);
		tp.ClickOnTrysoft();
		tp.ClickOnSolutions();
		tp.ClickOnSolutionsOption();
		tp.ClickOnIndustries();
		tp.ClickOnIndustriesOPtion();
	
	}
	
	

}
