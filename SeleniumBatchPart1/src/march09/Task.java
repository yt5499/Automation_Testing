//Open facebook login page & enter invalid credentials and press login button.
//Your task is to take a SS of error message appeared on login page.

package march09;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public static void main(String[] args) throws Exception {
		WebDriver cd = new ChromeDriver();
		
		cd.navigate().to("https://www.facebook.com/");
		cd.manage().window().maximize();
		
		cd.findElement(By.id("email")).sendKeys("invalid@invalid.com");
		cd.findElement(By.id("pass")).sendKeys("invalid@123");
		cd.findElement(By.name("login")).click();
		
		Thread.sleep(10000);
		
//		taking SS of error page
		File SSsrc = ((TakesScreenshot) cd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SSsrc, new File("C:\\Users\\Yash\\eclipse-workspace-ee\\SeleniumBatch\\screenShots\\errorPage.png"));
		
//		cd.quit();
	}
}
