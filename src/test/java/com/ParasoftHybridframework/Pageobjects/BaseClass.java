package com.ParasoftHybridframework.Pageobjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.ParasoftHybridframework.utilities.ReadConfig;

public class BaseClass {
	 ReadConfig rc = new ReadConfig();
    public String url = rc.getAppURL();
	public String Edgepath = rc.getEdgepath();
	public static WebDriver driver;
	
	@BeforeClass
	public void setup() {
	System.setProperty("webdriver.edge.driver", rc.getEdgepath());
	driver = new EdgeDriver();
			
	driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get(url);
	driver.findElement(By.xpath("//a[@id='hs-eu-confirmation-button']")).click();
	}
	//venkat
	@AfterClass
	public void teardown() {
	driver.quit();
	}
}



