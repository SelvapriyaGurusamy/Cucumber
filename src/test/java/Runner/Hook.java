package Runner;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;



public class Hook {
	public static WebDriver driver;
@Before
public static void launchbrowser() {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADMIN\\eclipse-workspace\\Cucumber_New\\chrome\\chromedriver.exe");
	driver = new ChromeDriver();
}

@After
public static void close() {
	driver.close();
}
}
