package march04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWindow {
	public static void main(String[] args) throws Exception {
//		invoke browser
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://demo.automationtesting.in/Frames.html");
		cd.manage().window().maximize();
		
//		store frame address in webelement type
		WebElement frameAddress = cd.findElement(By.id("singleframe"));
		
//		now switch to frame
		cd.switchTo().frame(frameAddress);
		
//		now enter value in text box which is in frame
		cd.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Namaskar");
		
//		coming out of frame
		cd.switchTo().defaultContent();
		
		Thread.sleep(3000);
		
		cd.quit();
	}
}
