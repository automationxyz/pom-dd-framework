package com.automation.page;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// instance variables - elements
	// WebElement signinLink = Driver.findElement(By.id("globalMastheadSignIn"));
	@FindBy(id = "globalMastheadSignIn")
	WebElement signInLink;

	// constructor
	public HomePage(WebDriver driverObject) {

		PageFactory.initElements(driverObject, this);
	}

	// methods - action on the elements
	public void clickSignInLink() {
		signInLink.click();
	}

	@FindBy(xpath = "//a[text()='WOMEN']")
	WebElement Women;

	@FindBy(xpath = "//ul[@class='flexLabelLinksContainer']/li[22]/a[text()='Tops']")
	WebElement Tops;

	@FindBy(id = "globalSearchInputField")
	WebElement searchBtn;

	public void SearchBtn() {
		searchBtn.click();
	}
}