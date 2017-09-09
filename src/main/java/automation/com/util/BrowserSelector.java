package automation.com.util;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelector {
	
	WebDriver driver;
	
	public WebDriver openBrowser(String browserName) throws IOException {
		
		//create ConfigReader object
		ConfigReader configReaderObject = new ConfigReader();
		configReaderObject.readAndLoadPropertiesFile();
		
		String ffDriverPath = configReaderObject.getFirefoxDriverPath();
		String chromeDriverPath = configReaderObject.getChromeDriverPath();
		
		if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", ffDriverPath);
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", chromeDriverPath);
			driver = new ChromeDriver();
		}
		
		return driver;
	}	
}


