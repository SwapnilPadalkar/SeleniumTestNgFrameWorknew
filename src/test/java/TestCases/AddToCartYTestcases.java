package TestCases;

import java.util.Arrays;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import Resources.baseClass;
import Resources.commonMethods;
import Resources.constants;
import pageObjectModels.AddToCartPageObjects;

public class AddToCartYTestcases extends baseClass {
	@Test
	public void verifyProductInCart() throws InterruptedException {
		
		AddToCartPageObjects aho=new AddToCartPageObjects(driver);
		//driver.findElement(By.xpath("//input[@name='search']")).sendKeys("iphone");
		aho.SearchButton().sendKeys(constants.firstProduct);
		//driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		aho.ClickOnSearchButton().click();
		//String IphonePrice = driver.findElement(By.xpath("//p[@class='price']")).getText();
		String IphonePrice=aho.getIphonePrice().getText();
		//driver.findElement(By.xpath("(//i[@class='fa fa-shopping-cart'])[3]")).click();
		// System.out.println(IphonePrice);
		aho.clickOnIphoneAddToCart().click();

		String[] iphonearray = IphonePrice.split(" ");
		// System.out.println(Arrays.toString(iphonearray));
		String iphonePrice1 = iphonearray[0];
		// System.out.println(iphonePrice1);
		String iphoneFinalPrice = iphonePrice1.replaceAll("[^\\d.]", "");
		//System.out.println(iphoneFinalPrice);

		double iphoneFinalPricedouble = Double.parseDouble(iphoneFinalPrice);
		
		//driver.findElement(By.xpath("//input[@name='search']")).clear();
		aho.SearchButton().clear();
		
		//add To cart samsung
		
		//driver.findElement(By.xpath("//input[@name='search']")).sendKeys("samsung");
		aho.SearchButton().sendKeys(constants.SecondProduct);
		//driver.findElement(By.xpath("//button[@class='btn btn-default btn-lg']")).click();
		aho.ClickOnSearchButton().click();
		//String SamsungPrice = driver.findElement(By.xpath("//h4/a[text()='Samsung Galaxy Tab 10.1']/following::p[@class='price']")).getText();
		String SamsungPrice=aho.getSamsungPrice().getText();
		String Samsungarray[]=SamsungPrice.split(" ");
		String SamsungPrice1= Samsungarray[0];
		String SamsungFilalPrice=SamsungPrice1.replaceAll("[^\\d.]", "");
		double SamsungFinalPricedouble = Double.parseDouble(SamsungFilalPrice);
		//Thread.sleep(2000);
		commonMethods.explicitewaitHandle(driver, 2, aho.clickOnSamsungAddToCart());
		//driver.findElement(By.xpath("//h4/a[text()='Samsung Galaxy Tab 10.1']/following::i[@class='fa fa-shopping-cart']")).click();
		aho.clickOnSamsungAddToCart().click();
		Double TotalPrice=iphoneFinalPricedouble+SamsungFinalPricedouble;
		
		System.out.println(TotalPrice);
		//Thread.sleep(4000);
		commonMethods.explicitewaitHandle(driver, 5, aho.clickAddonCartButton());
		//driver.findElement(By.xpath("//span[@id='cart-total']")).click();
		aho.clickAddonCartButton().click();
		//String CartFinalPrice=driver.findElement(By.xpath("//table[@class='table table-bordered']//td[text()='$365.19']")).getText();
		
		String CartFinalPrice=aho.getTotalPrice().getText();
		
		//System.out.println(CartFinalPrice);
		
		String CartFinalPrice1=CartFinalPrice.replaceAll("[^\\d.]", "");
		double CartTotalPrice = Double.parseDouble(CartFinalPrice1);
		System.out.println(CartTotalPrice);
		
		if(TotalPrice.equals(CartTotalPrice)) {
			
			
		System.out.println("Verify Product in Cart Testcaes is Pass");
							
			
		}else {
			System.out.println("Verify Product in Cart Testcaes is fail");
			
		}
		
		
		
	}

}
