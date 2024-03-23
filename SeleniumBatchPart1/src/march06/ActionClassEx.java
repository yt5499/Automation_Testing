package march06;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassEx {

	public static void main(String[] args) throws Exception {
		
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://www.htmlelements.com/demos/textbox/basic/");
		
		cd.findElement(By.cssSelector("input[placeholder='Search demos..']")).sendKeys("is facebook useless?");
		
		Actions ac = new Actions(cd);
		
//		performing key operations
		
		ac.keyDown(Keys.CONTROL);
		ac.sendKeys("a");
		ac.keyUp(Keys.CONTROL);
		ac.perform();
		
		ac.keyDown(Keys.CONTROL);
		ac.sendKeys("c");
		ac.keyUp(Keys.CONTROL);
		ac.perform();
		
		cd.findElement(By.className("smart-input"));
		
		ac.keyDown(Keys.CONTROL);
		ac.sendKeys("v");
		ac.keyUp(Keys.CONTROL);
		ac.perform();
		
		
		
		Thread.sleep(3000);
		cd.quit();

	}

}
