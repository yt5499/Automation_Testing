//2. Web element SS

package march09;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotEx2 {
	public static void main(String[] args) throws Exception {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://www.facebook.com/");
		cd.manage().window().maximize();
		
		WebElement ele = cd.findElement(By.className("_8eso"));
		File SSsrc = ((TakesScreenshot) ele).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SSsrc, new File("C:\\Users\\Yash\\eclipse-workspace-ee\\SeleniumBatch\\screenShots\\sibgleEleFB.png"));
		
		Thread.sleep(2000);
		cd.quit();
	}
}
