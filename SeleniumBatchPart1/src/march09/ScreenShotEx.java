//* we take screenshot as an evidence
//* we can take two types of screenshot:
//		1. web page SS
//		2. web element SS

//use this path to store SS: 
//	C:\Users\Yash\eclipse-workspace-ee\SeleniumBatch\screenShots

//1. Web page SS

package march09;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotEx {
	public static void main(String[] args) throws Exception {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://www.facebook.com/");
		cd.manage().window().maximize();
		
		File SSsrc = ((TakesScreenshot) cd).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(SSsrc, new File("C:\\Users\\Yash\\eclipse-workspace-ee\\SeleniumBatch\\screenShots\\fbPage.png"));
		
		Thread.sleep(5000);
		cd.quit();
		
	}
}
