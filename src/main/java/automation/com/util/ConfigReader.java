package automation.com.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {
	String configFilePath = "C:\\Training\\pageobject-datadriven-framework\\properties\\config2.properties";
	Properties props;

	public void readAndLoadPropertiesFile() throws IOException {
		FileInputStream fis = new FileInputStream(configFilePath);
		props = new Properties();
		props.load(fis);

	}

	public String getApplicationUrl() {
		String value = props.getProperty("application.url");
		return value;

	}

	public String getFirefoxDriverPath() {
		String value = props.getProperty("ff.driver.path");
		return value;
	}

	public String getChromeDriverPath() {
		String value = props.getProperty("chrome.driver.path");
		return value;
	}
}
