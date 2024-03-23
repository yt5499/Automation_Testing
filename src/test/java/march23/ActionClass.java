package march23;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClass {
	public static void main(String[] args) throws Exception {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		cd.manage().window().maximize();
		
		cd.findElement(By.name("email")).sendKeys("rajubhai@cmail.com");
		
		Actions ac = new Actions(cd);
		ac.sendKeys(Keys.TAB);
		ac.perform();
		
		ac.sendKeys("ajhdkajhdkjasd");
		ac.perform();
		
		ac.sendKeys(Keys.TAB);
		ac.perform();
		ac.sendKeys(Keys.TAB);
		ac.perform();
		
		ac.sendKeys(Keys.ENTER);
		ac.perform();
		
		Thread.sleep(3000);
		cd.quit();
	}
}
