package march23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownEx {
	public static void main(String[] args) throws Exception {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/#google_vignette");
		cd.manage().window().maximize();
		
		WebElement dd = cd.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));
		
		Select s = new Select(dd);
		s.selectByValue("IND");
		
		Thread.sleep(3000);
		
		cd.quit();
	}
}
