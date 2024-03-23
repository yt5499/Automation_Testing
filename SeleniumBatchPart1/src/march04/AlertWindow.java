//alert window with only ok button

package march04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindow {
	public static void main(String[] args) throws Exception{
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://demo.automationtesting.in/Alerts.html");
		cd.manage().window().maximize();
		
		cd.findElement(By.xpath("//*[@id=\"OKTab\"]/button")).click();
		Thread.sleep(5000);
//		methods to press ok button
		cd.switchTo().alert().accept();
		
		cd.quit();
	}
}
