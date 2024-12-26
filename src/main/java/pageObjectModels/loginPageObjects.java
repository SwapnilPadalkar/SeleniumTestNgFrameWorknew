package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginPageObjects {

	public WebDriver driver;

	private By loginEmail = By.xpath("//input[@name='email']");
	private By loginPassword = By.xpath("//input[@name='password']");
	private By clickOnLogin = By.xpath("//input[@value='Login']");
	private By actualResultLogin=By.xpath("//h2[text()='My Account']");

	public loginPageObjects(WebDriver driver) {
		
		this.driver=driver;
		// TODO Auto-generated constructor stub
	}

	public WebElement loginEmail() {

		return driver.findElement(loginEmail);

	}

	public WebElement loginPassword() {

		return driver.findElement(loginPassword);

	}

	public WebElement clickOnLogin() {

		return driver.findElement(clickOnLogin);

	}
	public WebElement checkactualReulstlogin() {
		return driver.findElement(actualResultLogin);
	}
}
