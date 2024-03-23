//implicit wait: is applied globally or to all elements on the web page
package march08;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitEx {
	public static void main(String[] args) {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		cd.manage().window().maximize();
		
//		creating implicit wait
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
//		entering username
		cd.findElement(By.name("username")).sendKeys("Admin");
//		entering password
		cd.findElement(By.name("password")).sendKeys("admin123");
//		logging in
		cd.findElement(By.cssSelector("button[type='submit']")).click();
	}
}
