package com.automation.util;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelector {
	WebDriver driver;

	public WebDriver openBrowser(String browserName) throws IOException {
		{
			// create configReader object
			ConfigReader configReaderObject = new ConfigReader();
			configReaderObject.readAndLoadPropertiesFile();
			
			String ffDriverPath = configReaderObject.getFirefoxDriverpath();
			String chromeDriverPath = configReaderObject.getChormeDriverPath();
			
			if (browserName.equalsIgnoreCase("firefox")) {
				System.setProperty("webdriver.gecko.driver", ffDriverPath);
				driver = new FirefoxDriver();

			}
			if (browserName.equalsIgnoreCase("chrome")) {
				System.setProperty("webdriver.chrome.driver", chromeDriverPath);
				driver = new ChromeDriver();
				
			}
		}
		return driver;
		
	}
}