package SeleniumPrepare;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class BootstrapModel extends Base {
	@Test

	public void model() throws InterruptedException {
		driver.findElement(By.xpath("//a[normalize-space()='2016']")).click();
		driver.findElement(By.xpath("//button[normalize-space()='Click here to Login']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("HSDus");
	}
}
