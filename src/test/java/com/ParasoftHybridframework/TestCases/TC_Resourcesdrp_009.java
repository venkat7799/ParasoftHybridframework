package com.ParasoftHybridframework.TestCases;

import org.testng.annotations.Test;

import com.ParasoftHybridframework.Pageobjects.BaseClass;
import com.ParasoftHybridframework.Pageobjects.Resourcesdrp;

public class TC_Resourcesdrp_009 extends BaseClass{
	@Test
	public void AnalystResearch() {
		Resourcesdrp rp = new Resourcesdrp(driver);
		rp.ClickonResources();
		rp.ClickOnAnalystResearch();
	}
	@Test
	public void Blog() {
		Resourcesdrp rp = new Resourcesdrp(driver);
		rp.ClickonResources();
		rp.ClickOnBlog();
	}
	@Test
	public void Brouchures() {
		Resourcesdrp rp = new Resourcesdrp(driver);
		rp.ClickonResources();
		rp.ClickOnBrochures();
	}
	@Test
	public void CaseStudies() {
		Resourcesdrp rp = new Resourcesdrp(driver);
		rp.ClickonResources();
		rp.ClickOnCaseStudies();
	}

}
