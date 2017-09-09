package com.automation.util;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.testng.annotations.Test;

public class ConfigReader {
	// Locate the config.properties
	String configFilePath = "C:\\Training\\pageobject-datadriven-framework\\properties\\config.properties";

	Properties props;
	
	
	public void readAndLoadPropertiesFile() throws IOException {
		// open the file
		FileInputStream fis = new FileInputStream(configFilePath);
		// Creating properties object
		props = new Properties();
		// load the properties file
		props.load(fis);
	}
	
	public String getApllicationUrl() {
		// read property
		String value = props.getProperty("application.url");
		//System.out.println(value);
		return value;

	}

	public String getFirefoxDriverpath() {
		// read property
		String value = props.getProperty("ff.driver.path");
		return value;
	}

	public String getChormeDriverPath() {
		// read property
		String value = props.getProperty("chorme.driver.path");
		return value;
	}
	
}