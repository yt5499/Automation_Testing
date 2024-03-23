package march04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameWindow2 {
	public static void main(String[] args) {
		WebDriver cd = new ChromeDriver();

		cd.get("https://demo.automationtesting.in/Frames.html");
		cd.manage().window().maximize();
		
		cd.findElement(By.linkText("Iframe with in an Iframe")).click();
		
//		storing both frames in webelement
		WebElement frm1 = cd.findElement(By.xpath("/html/body/section/div[1]/div/div/div/div[2]/div[2]/iframe"));
		WebElement frm2 = cd.findElement(By.xpath("/html/body/section/div/div/iframe"));
		
		cd.switchTo().frame(frm1);
		cd.switchTo().frame(frm2);
		
		cd.findElement(By.xpath("/html/body/section/div/div/div/input")).sendKeys("Nj");
		
		cd.quit();
	}
}
