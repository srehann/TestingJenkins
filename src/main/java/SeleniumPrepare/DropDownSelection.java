package SeleniumPrepare;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropDownSelection extends Base{
@Test
public void drop() throws Exception {
	List<WebElement> years=driver.findElements(By.className("post-count-link"));
	years.get(0).click();
	dropByValue();
	String city=driver.findElement(By.name("city")).getText();
	System.out.println(city);
	
	Thread.sleep(5000);
}

public static WebElement dropByValue() {
	WebElement we=driver.findElement(By.name("city"));
	
	Select select=new Select(we);	
	select.selectByValue("PN");
	return we;
}
	
}
