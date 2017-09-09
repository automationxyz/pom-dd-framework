package com.automation.page;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPage {

 // instance variables - elements
 @FindBy(id = "email")
 WebElement EmailAddress;
 
 // WebElement PassWord = Driver.findElement(By.id("password"));
  @FindBy(id = "password")
  WebElement passWord;
  
  // click on signin
  @FindBy(id = "signInBtn")
 WebElement signIn;

 // construtor
 public SignInPage(WebDriver driverObject) {
  PageFactory.initElements(driverObject, this);
 }

 // methods - action on the elements
 public void typeEmailAddress(String emailAddress) {
  EmailAddress.sendKeys(emailAddress);
 }

  // methods - action on the elements
 public void typePassWord(String passwordText) {
  passWord.sendKeys(passwordText);
 }


 public void clicksignIn() {
  signIn.click();
 }
 
 public void submitLoginCredentials(String emailAddress, String passwordText) {
	 typeEmailAddress(emailAddress);
	 typePassWord(passwordText);
	 clicksignIn();
 }
}