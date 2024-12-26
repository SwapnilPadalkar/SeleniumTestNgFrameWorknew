package Resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

//browser launch code
public class baseClass {

	public WebDriver driver;
	public static String EmailAddress=generateRandomEmailId();
	public Properties prop;

	public void initilizeDriver() throws IOException {

		FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\src\\main\\java\\Resources\\data.properties");
		//"C:\\Users\\Swapnil\\eclipse-workspace\\Selenium_TestNgFramework\\src\\main\\java\\Resources\\data.properties");
		prop = new Properties();

		prop.load(fis);
		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {

			driver = new ChromeDriver();
		} else if (browserName.equalsIgnoreCase("FireFox")) {

			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("edge")) {

			driver = new EdgeDriver();

		} else {

			System.out.println("Please choice the correct browser");
		}

	}

	public static String generateRandomEmailId() {

		return System.currentTimeMillis() + "@gamil.com";
	}
	
	
	@BeforeMethod
	public void browserlaunch() throws IOException, InterruptedException {
		initilizeDriver();
		driver.manage().window().maximize();
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		
		
	}	
}
