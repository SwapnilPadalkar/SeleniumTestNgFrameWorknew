package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registrationPageObjects {

	public WebDriver driver;

	public registrationPageObjects(WebDriver driver) {
		this.driver = driver;

		// TODO Auto-generated constructor stub
		}
	

	private By firstName = By.xpath("//input[@name='firstname']");
	private By lastName = By.xpath("//input[@name='lastname']");
	private By eMail = By.xpath("//input[@name='email']");
	private By telePhone = By.xpath("//input[@name='telephone']");
	private By passWord = By.xpath("//input[@name='password']");
	private By confirmPassword = By.xpath("//input[@name='confirm']");
	private By clickOnPrivacypolicy = By.xpath("//input[@name='agree']");
	private By clickOnContinue = By.xpath("//input[@value='Continue']");
	private By actualresult=By.xpath("//h1[text()='Your Account Has Been Created!']");
	private By checkfisrtname=By.xpath("//div[text()='First Name must be between 1 and 32 characters!']");
	private By checklastname=By.xpath("//div[text()='Last Name must be between 1 and 32 characters!']");
	private By checkemail=By.xpath("//div[text()='E-Mail Address does not appear to be valid!']");
	private By checktelephone=By.xpath("//div[text()='Telephone must be between 3 and 32 characters!']");
	private By checkpassword=By.xpath("//div[text()='Password must be between 4 and 20 characters!']");

	
	public WebElement firstName() {

		return driver.findElement(firstName);
	}

	public WebElement lastName() {

		return driver.findElement(lastName);
	}

	public WebElement eMail() {

		return driver.findElement(eMail);

	}

	public WebElement telePhone() {

		return driver.findElement(telePhone);
	}

	public WebElement password() {

		return driver.findElement(passWord);
	}

	public WebElement confirmPassword() {

		return driver.findElement(confirmPassword);
	}

	public WebElement clickOnContinue() {

		return driver.findElement(clickOnContinue);
	}

	public WebElement clickOnPrivacyPolicy() {

		return driver.findElement(clickOnPrivacypolicy);

	}
	public WebElement actualResultReg() {
		
		return driver.findElement(actualresult);
	}
public WebElement checkFirstName() {
		
		return driver.findElement(checkfisrtname);
		}
public WebElement checkLastName() {
	
	return driver.findElement(checklastname);
	}
public WebElement checkEmail() {
	
	return driver.findElement(checkemail);
}
public WebElement checkTelephone() {
	
	return driver.findElement(checktelephone);
}
public WebElement checkPassword() {
	
	return driver.findElement(checkpassword);
}
	
}
