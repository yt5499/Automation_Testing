package march06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {
	public static void main(String[] args) throws Exception {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
//		locating address of dropdown list and storing it
		WebElement ddAddress = cd.findElement(By.cssSelector("div[class='single_tab_div resp-tab-content resp-tab-content-active'] p select"));
		
//		creating instance/object of select class
		Select sel = new Select(ddAddress);
		
//		selecting by name/visible text from dd list
		sel.selectByVisibleText("Antarctica");
		Thread.sleep(3000);
		
//		selecting by index
		sel.selectByIndex(26);
		Thread.sleep(3000);
		
//		selecting by attribute value
		sel.selectByValue("IND");
		Thread.sleep(5000);
		
		Thread.sleep(5000);
		cd.quit();
	}
}
