package march24;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitEx {
	public static void main(String[] args) {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		cd.manage().window().maximize();
		
////		implicit wait
//		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
//		explicit wait- webdriverwait
		WebDriverWait wait = new WebDriverWait(cd, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");
		
		
//		cd.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		
		Actions ac = new Actions(cd);
		ac.sendKeys(Keys.TAB);
		ac.perform();
		
		ac.sendKeys("admin123");
		ac.perform();
		
		ac.sendKeys(Keys.TAB);
		ac.perform();
		
		ac.sendKeys(Keys.ENTER);
		ac.perform();
		
	}
}
