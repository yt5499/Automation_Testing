//dialogbox with only ok button

package march23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ex {
	public static void main(String[] args) throws Exception {
		WebDriver cd = new ChromeDriver();
		
		cd.navigate().to("https://demo.automationtesting.in/Alerts.html");
		cd.manage().window().maximize();
		
		cd.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Thread.sleep(3000);
		
		cd.switchTo().alert().accept();
		
		cd.quit();
	}
}
