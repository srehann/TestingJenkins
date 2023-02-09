package SeleniumPrepare;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Hovering extends Base{

	
	@Test
	public void hower() {
		driver.findElement(By.xpath("//ul[@class='posts']//a[contains(text(),'BootStrap ToolTip in Selenium')]")).click();

		WebElement w=driver.findElement(By.xpath("//a[normalize-space()='Hover over me']"));
		
				
		Actions ac=new Actions(driver);
		ac.moveToElement(w).build().perform();
	
	}
}
