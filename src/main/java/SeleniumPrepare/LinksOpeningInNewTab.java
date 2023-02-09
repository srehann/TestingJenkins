package SeleniumPrepare;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class LinksOpeningInNewTab extends Base{
	@Test
	public void link() {
	WebElement we=	driver.findElement(By.xpath("//div[@id='post-body-1914831117126047593']//a[normalize-space()='Google']"));
	Actions ac=new Actions(driver);
	ac.keyDown(Keys.DOWN).sendKeys(we).keyUp(Keys.UP).build().perform();
		
	}

}
