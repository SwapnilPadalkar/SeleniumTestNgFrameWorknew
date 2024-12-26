package pageObjectModels;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddToCartPageObjects {
	public WebDriver driver;

	private By SearchButton = By.xpath("//input[@name='search']");
	private By ClickOnSearchButton = By.xpath("//button[@class='btn btn-default btn-lg']");
	private By getIphonePrice = By.xpath("//p[@class='price']");
	private By IphoneClickOnAddToCart = By.xpath("(//i[@class='fa fa-shopping-cart'])[3]");
	private By getSamsungPrice=By.xpath("//h4/a[text()='Samsung Galaxy Tab 10.1']/following::p[@class='price']");
	private By clickOnSamsungAddToCart=By.xpath("//h4/a[text()='Samsung Galaxy Tab 10.1']/following::i[@class='fa fa-shopping-cart']");
	private By clickOnAddtoCartButton=By.xpath("//div[@id='cart']");
	
	private By getTotalCartPrice=By.xpath("//table[@class='table table-bordered']//td[text()='$365.19']");

	public AddToCartPageObjects(WebDriver driver) {

		this.driver = driver;
		// TODO Auto-generated constructor stub
	}

	public WebElement SearchButton() {
		return driver.findElement(SearchButton);
	}

	public WebElement ClickOnSearchButton() {

		return driver.findElement(ClickOnSearchButton);
	}

	public WebElement getIphonePrice() {

		return driver.findElement(getIphonePrice);
	}

	public WebElement clickOnIphoneAddToCart() {

		return driver.findElement(IphoneClickOnAddToCart);
	}
	public WebElement getSamsungPrice() {
		return driver.findElement(getSamsungPrice);
	}
	public WebElement clickOnSamsungAddToCart() {
		return driver.findElement(clickOnSamsungAddToCart);
	}
	public WebElement clickAddonCartButton() {
		return driver.findElement(clickOnAddtoCartButton);
	}
	public WebElement getTotalPrice() {
		return driver.findElement(getTotalCartPrice);
	}
	
}
