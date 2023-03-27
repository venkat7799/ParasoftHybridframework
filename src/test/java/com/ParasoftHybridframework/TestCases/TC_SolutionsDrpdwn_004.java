package com.ParasoftHybridframework.TestCases;

import org.testng.annotations.Test;

import com.ParasoftHybridframework.Pageobjects.BaseClass;
import com.ParasoftHybridframework.Pageobjects.SolutionsDrpdwn;

public class TC_SolutionsDrpdwn_004 extends BaseClass{
	
	@Test
	public void APIsecurityTesting() {
		SolutionsDrpdwn sd = new SolutionsDrpdwn(driver);
		sd.ClickOnSolutions();
		sd.ClickOnSecurityTesting();
	}
	
	@Test
	public void  APItesting() {
		SolutionsDrpdwn sd = new SolutionsDrpdwn(driver);
		sd.ClickOnSolutions();
		sd.ClickOnAPITesting();
	}
	
	@Test
	public void CodeCoverage() {
		SolutionsDrpdwn sd = new SolutionsDrpdwn(driver);
		sd.ClickOnSolutions();
		sd.CliclOnCodeCoverage();
	}
	
	@Test
	public void UnitTesting() {
		SolutionsDrpdwn sd = new SolutionsDrpdwn(driver);
		sd.ClickOnSolutions();
		sd.ClickOnUnitTesting();
	}


}

