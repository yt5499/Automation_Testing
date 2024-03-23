package march02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main3 {
	public static void main(String[] args) {
		WebDriver cd = new ChromeDriver();
		
		cd.navigate().to("https://www.amazon.in/");
		
		cd.manage().window().maximize();
		
		cd.findElement(By.id("twotabsearchtextbox")).sendKeys("windchimes");
		
		cd.findElement(By.id("nav-search-submit-button")).click();
		
		cd.navigate().back();
		cd.navigate().forward();
		
		cd.quit();
	}
}
