package march06;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClassEx2 {
	public static void main(String[] args) throws Exception {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://www.instagram.com/accounts/emailsignup/?hl=en");
		cd.manage().window().maximize();
		
//		locating the web element which you want to edit
		cd.findElement(By.cssSelector("input[name='fullName']")).sendKeys("Iam the only King!");
		
		Actions ac = new Actions(cd);
		
		ac.keyDown(Keys.CONTROL);
		ac.sendKeys("a");
		ac.keyUp(Keys.CONTROL);
		ac.perform();
		
		ac.keyDown(Keys.CONTROL);
		ac.sendKeys("c");
		ac.keyUp(Keys.CONTROL);
		ac.perform();
		
		ac.sendKeys(Keys.TAB);
		
		Thread.sleep(3000);
		
		ac.keyDown(Keys.CONTROL);
		ac.sendKeys("v");
		ac.keyUp(Keys.CONTROL);
		ac.perform();
		
		Thread.sleep(5000);
		cd.quit();
	}
}
