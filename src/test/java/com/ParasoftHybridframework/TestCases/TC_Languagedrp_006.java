package com.ParasoftHybridframework.TestCases;

import org.testng.annotations.Test;

import com.ParasoftHybridframework.Pageobjects.BaseClass;
import com.ParasoftHybridframework.Pageobjects.Languagedrp;

public class TC_Languagedrp_006 extends BaseClass{
	@Test
	public void languagedrp() {
		Languagedrp lp = new Languagedrp(driver);
		lp.ClickOnLanguage();
	}

}
