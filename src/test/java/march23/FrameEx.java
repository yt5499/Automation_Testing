package march23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameEx {
	public static void main(String[] args) throws Exception {
		WebDriver cd = new ChromeDriver();

		cd.get("https://demo.automationtesting.in/Frames.html");
		cd.manage().window().maximize();
		
		WebElement frameAdd = cd.findElement(By.id("singleframe"));
		
		cd.switchTo().frame(frameAdd);
		
		cd.findElement(By.xpath("//input[@type='text']")).sendKeys("Welcome inside the frame");
		
		cd.switchTo().defaultContent();
		
		cd.findElement(By.className("analystic")).click();
		
		Thread.sleep(3000);
		
		cd.quit();
	}
}
