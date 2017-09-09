package com.automation;

import java.io.IOException;

import com.automation.util.BrowserSelector;

public class TestClass {

	public static void main(String[] args) throws IOException {
		BrowserSelector obj= new BrowserSelector();
		obj.openBrowser("firefox");

	}

}
