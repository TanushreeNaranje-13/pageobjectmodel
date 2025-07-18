package utility;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AppUtil {
	public static WebDriver driver;
	public static  String url="http://orangehrm.qedgetech.com";
	
	@BeforeSuite
	public static void LauchApp() {
		System.setProperty("webdriver.chrome.driver", "chromedriver1.exe");
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		}

    @AfterSuite
	public static void  closeApp() {
	driver.close();
	}
}
