package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homePageObjects {
	public WebDriver driver;
	private By myAccount = By.xpath("//span[text()='My Account']");
	private By register = By.xpath("//a[text()='Register']");
	private By login = By.xpath("//a[text()='Login']");

	// Constructor
	public homePageObjects(WebDriver driver) {
		// TODO Auto-generated constructor stub

		this.driver = driver;
	}

	public WebElement clickonmyAccount() {

		return driver.findElement(myAccount);

	}

	public WebElement clickOnRegister() {

		return driver.findElement(register);
	}
	
	public WebElement clickOnLogin() {
	
		return driver.findElement(login);
	}
	}
