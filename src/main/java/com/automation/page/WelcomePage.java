package com.automation.page;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
 
 @FindBy(id = "globalMastheadSignout")
 WebElement signOut;
 
 WebDriver driver;

 // constructor
 public WelcomePage(WebDriver driverObject) {
  driver = driverObject; 
  PageFactory.initElements(driverObject, this);
 }

 public void verifyLoginIsSuccessful() {
	 
	 WebElement welcomeMessageElement = driver.findElement(By.id("globalMastheadUserSalutation"));
	 String welcomeMessageText = welcomeMessageElement.getText();	 
	 
	 assertTrue(welcomeMessageText.contains("Welcome"));
 }
	 
  public void clicksignOut() {
	  signOut.click();
  } 
}