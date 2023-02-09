package SeleniumPrepare;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Tables extends Base{
@Test
public void table() {
	driver.findElement(By.xpath("//a[normalize-space()='2021']")).click();
	List <WebElement> td=driver.findElements(By.xpath("//table[@id='customers']//tbody//td"));
	boolean b=false;
	for(WebElement x:td) {
		if(x.equals("FlipKart")) {
		System.out.println(x.getText());
		b=true;
		break;
		}
	}
}

}

