package automation.com.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	// instance variables - elements
	// WebElement signInLink =
	// driver.findElement(By.xpath("//div[@id='nav-flyout-ya-signin']/a/span"));
	@FindBy(xpath = "//div[@id='nav-flyout-ya-signin']/a/span")
	WebElement signInLink;

	// constructor
	public HomePage(WebDriver driverObject) {
		PageFactory.initElements(driverObject, this);
	}

	// methods - action on the elements
	public void clickSignInLink() {
		signInLink.click();
	}
}
