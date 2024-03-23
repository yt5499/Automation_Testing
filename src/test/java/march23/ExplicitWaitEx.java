//WebDriverWait

package march23;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEx {
	public static void main(String[] args) throws Exception {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		cd.manage().window().maximize();
		
//		cd.findElement(By.name("username")).sendKeys("Admin");
//		explicit wait
		WebDriverWait exWait = new WebDriverWait(cd, Duration.ofSeconds(20));
		exWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");		
		
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
