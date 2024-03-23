//explicit wait - is applied to single web element

package march08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitEx {
	public static void main(String[] args) {
		WebDriver cd = new ChromeDriver();
		
		cd.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		cd.manage().window().maximize();
		
//		explicit
		WebDriverWait explicitWait = new WebDriverWait(cd, Duration.ofSeconds(60));
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.name("username"))).sendKeys("Admin");
		
//		entering username
//		cd.findElement(By.name("username")).sendKeys("Admin");
//		entering password
		cd.findElement(By.name("password")).sendKeys("admin123");
//		logging in
		cd.findElement(By.cssSelector("button[type='submit']")).click();
	}
}
