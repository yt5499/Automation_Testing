package march23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ImplicitWaitEx {
	public static void main(String[] args) throws Exception {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		cd.manage().window().maximize();
		
//		implicit wait
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		cd.findElement(By.name("username")).sendKeys("Admin");
		
		Actions ac = new Actions(cd);
		
		ac.sendKeys(Keys.TAB);
		ac.perform();
		
		ac.sendKeys("admin123");
		ac.perform();
		
		ac.sendKeys(Keys.TAB);
		ac.perform();
		
		ac.sendKeys(Keys.ENTER);
		ac.perform();
		
		Thread.sleep(3000);
		
		cd.quit();
	}
}
