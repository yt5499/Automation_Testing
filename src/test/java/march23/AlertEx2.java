//alertbox with ok & cancel button

package march23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx2 {
	public static void main(String[] args) throws Exception {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://demo.automationtesting.in/Alerts.html");
		cd.manage().window().maximize();
		
		cd.findElement(By.cssSelector(".analystic[href='#CancelTab']")).click();
		cd.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Thread.sleep(3000);
//		will press ok(+ve) button
//		cd.switchTo().alert().accept();
		
//		will press cancel(-ve) button
		cd.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		cd.quit();
	}
}
