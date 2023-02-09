package SeleniumPrepare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class checkBoxes extends Base {

	@Test
	public void check() throws InterruptedException {
		
		 driver.findElement(By.name("same")).isEnabled();
		
		 System.out.println("This is enabled");
		WebElement we= driver.findElement(By.name("same"));
		we.click();
		if(we.isSelected())
		{
			driver.findElement(By.name("same"));
			we.click();
			
		}
		 Thread.sleep(5000);
		 
	}
}
