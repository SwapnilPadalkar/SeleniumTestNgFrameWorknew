package TestCases;

import java.io.IOException;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import Resources.baseClass;
import Resources.commonMethods;
import Resources.constants;
import pageObjectModels.homePageObjects;
import pageObjectModels.registrationPageObjects;

public class registrationTestCases extends baseClass {
	@Test
	public void verifyregistrationwithValidData() throws IOException, InterruptedException {

		homePageObjects hpo = new homePageObjects(driver);
		hpo.clickonmyAccount().click();
		commonMethods.explicitewaitHandle(driver,2, hpo.clickOnRegister());
		// Thread.sleep(1000);
		hpo.clickOnRegister().click();

		registrationPageObjects rpo = new registrationPageObjects(driver);
		rpo.firstName().sendKeys(constants.firstName);
		rpo.lastName().sendKeys(constants.lastName);
		rpo.eMail().sendKeys(EmailAddress);
		rpo.telePhone().sendKeys(constants.telephone);
		rpo.password().sendKeys(constants.password);
		rpo.confirmPassword().sendKeys(constants.password);
		rpo.clickOnPrivacyPolicy().click();
		rpo.clickOnContinue().click();

		// SoftAssert sa = new SoftAssert();

		String expected = "Your Account Has Been Created!";
		String actual = rpo.actualResultReg().getText();
		// sa.assertEquals(expected, actual);
		commonMethods.handleAssertation(expected, actual);
		// sa.assertAll();

	}

	@Test
	public void verifyRegistrationWithBlankData() throws IOException, InterruptedException {

		homePageObjects hpo = new homePageObjects(driver);

		hpo.clickonmyAccount().click();

		Thread.sleep(1000);
		hpo.clickOnRegister().click();

		registrationPageObjects rpo = new registrationPageObjects(driver);
		rpo.clickOnContinue().click();

		// SoftAssert sa = new SoftAssert();

		String fnameExpected = "First Name must be between 1 and 32 characters!";
		String fnameActual = rpo.checkFirstName().getText();
		commonMethods.handleAssertation(fnameActual, fnameExpected);

		// sa.assertEquals(fnameActual, fnameExpected);

		String lnameExpected = "Last Name must be between 1 and 32 characters!";
		String lnameActual = rpo.checkLastName().getText();
		commonMethods.handleAssertation(lnameActual, lnameExpected);

		// sa.assertEquals(lnameActual, lnameExpected);

		String emailExpected = "E-Mail Address does not appear to be valid!";
		String emailActual = rpo.checkEmail().getText();
		commonMethods.handleAssertation(emailActual, emailExpected);
		// sa.assertEquals(emailActual, emailExpected);

		String telephoneExpected = "Telephone must be between 3 and 32 characters!";
		String telephoneActual = rpo.checkTelephone().getText();
		commonMethods.handleAssertation(telephoneActual, telephoneExpected);
		// sa.assertEquals(telephoneActual, telephoneExpected);

		String passwordExpected = "Password must be between 4 and 20 characters!";
		String passwordActual = rpo.checkPassword().getText();
		commonMethods.handleAssertation(passwordActual, passwordExpected);
		// sa.assertEquals(passwordActual, passwordExpected);

		// sa.assertAll();

	}

}
