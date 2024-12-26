package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.baseClass;
import Resources.commonMethods;
import Resources.constants;
import pageObjectModels.homePageObjects;
import pageObjectModels.loginPageObjects;

public class loginTestCases extends baseClass {
     @Test
	public void verifyLoginwithData() throws IOException, InterruptedException {

		
		
		homePageObjects hpo = new homePageObjects(driver);
		hpo.clickonmyAccount().click();

		//Thread.sleep(1000);
	
		commonMethods.explicitewaitHandle(driver,2, hpo.clickOnLogin());
		hpo.clickOnLogin().click();	
		//Thread.sleep(1000);
		loginPageObjects lpo=new loginPageObjects(driver);
		lpo.loginEmail().sendKeys(EmailAddress);
		lpo.loginPassword().sendKeys(constants.password);
		lpo.clickOnLogin().click();
		
		//SoftAssert softas=new SoftAssert();
		
	String expected="My Account";
	String actual=lpo.checkactualReulstlogin().getText();
	commonMethods.handleAssertation(actual, expected);
		//softas.assertEquals(expected, actual);
		
		//softas.assertAll();	
	}
}
