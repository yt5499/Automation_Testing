package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class P1 {
	public static void main(String[] args) throws Exception {
		WebDriver cd = new ChromeDriver();
		
		cd.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
		cd.manage().window().maximize();
		
		cd.findElement(By.id("input-firstname")).sendKeys("Raju");
		cd.findElement(By.id("input-lastname")).sendKeys("Bhai");
		cd.findElement(By.id("input-email")).sendKeys("rajubhai@gmail.com");
		cd.findElement(By.id("input-password")).sendKeys("Bhairaju123");
//		radio button
		WebElement radioBtn = cd.findElement(By.id("input-newsletter-yes"));
		if(!radioBtn.isSelected()) {
			radioBtn.click();
		}
//		checkbox
		WebElement checkbx = cd.findElement(By.name("agree"));
		if(!checkbx.isSelected()) {
			checkbx.click();
		}
		
		Thread.sleep(5000);
		
//		final button
		cd.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
		
		Thread.sleep(5000);
		
		cd.close();
		
		
	}
}
