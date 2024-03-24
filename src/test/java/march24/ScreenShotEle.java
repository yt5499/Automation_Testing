package march24;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotEle {
	public static void main(String[] args) throws Exception {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		cd.manage().window().maximize();
		
		Thread.sleep(40000);
		
		WebElement ele = cd.findElement(By.xpath("//div[@class=\"oxd-sheet oxd-sheet--rounded oxd-sheet--gutters oxd-sheet--gray-lighten-2 orangehrm-demo-credentials\"]"));
		
		File ss = ((TakesScreenshot)ele).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(ss, new File("C:\\Users\\Yash\\eclipse-workspace-ee\\SeleniumBatch2\\screenShots\\credentials.png"));
		
		cd.quit();
		
	}
}
