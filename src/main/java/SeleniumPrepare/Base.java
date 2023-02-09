package SeleniumPrepare;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class Base {
	public static WebDriver driver;
	
	@BeforeTest
	public void before() {
		getBrowser("Chrome");
		driver.manage().window().maximize();
		driver.get("http://seleniumpractise.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	}
	
	@AfterTest
	public void after() {
		driver.quit();
	}
	
	
	public static void getBrowser(String browser) {
		if(browser.equalsIgnoreCase("Chrome")) {
			driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Edge")) {
			driver=new EdgeDriver();
		}
	}

}
