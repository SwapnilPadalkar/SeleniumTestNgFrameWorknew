package Resources;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

public class commonMethods {

	public static void handleAssertation(String expectedResult,String actualResult ) {

		SoftAssert sa = new SoftAssert();
		
		String expected=expectedResult;
		String actual=actualResult;
		sa.assertEquals(actual, expected);
	}
	
	
	public static void explicitewaitHandle(WebDriver driver,int time,WebElement element) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(time));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

}
