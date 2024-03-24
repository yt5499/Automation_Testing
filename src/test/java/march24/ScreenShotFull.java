//path to use: C:\Users\Yash\eclipse-workspace-ee\SeleniumBatch2\screenShots

package march24;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenShotFull {
	public static void main(String[] args) throws Exception {
		WebDriver cd = new ChromeDriver();
		cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		cd.manage().window().maximize();
		
		Thread.sleep(40000);

		File ss = ((TakesScreenshot)cd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File("C:\\Users\\Yash\\eclipse-workspace-ee\\SeleniumBatch2\\screenShots\\orgHR.png"));
		
		cd.quit();
		
	}
}
