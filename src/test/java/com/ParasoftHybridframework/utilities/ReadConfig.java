package com.ParasoftHybridframework.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

public class ReadConfig {
	public WebDriver driver;
	Properties pro;
	public ReadConfig() {
		
		File src = new File("./configuration/config.properties");
		try {
		FileInputStream fip = new FileInputStream(src);
		pro = new Properties();
		pro.load(fip);
		}catch(Exception e)
		{
			System.out.println("Exception is" + e.getMessage());
		}
	}

	public String getAppURL() {
		String url = pro.getProperty("url");
		return url;
	}
	
	public String getEdgepath() {
		String Edgepath = pro.getProperty("Edgepath");
		return Edgepath;
	}
	
	
}
