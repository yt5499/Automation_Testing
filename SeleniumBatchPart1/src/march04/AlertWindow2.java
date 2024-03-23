//alert window with ok & cancel button

package march04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindow2 {
	public static void main(String[] args) throws Exception {
		WebDriver cd = new ChromeDriver();
		
		cd.navigate().to("https://demo.automationtesting.in/Alerts.html");
		cd.manage().window().maximize();
		
		cd.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[2]/a")).click();
		cd.findElement(By.xpath("//*[@id=\"CancelTab\"]/button")).click();
		
		Thread.sleep(5000);
		
//		methods for pressing ok button on alert box
//		cd.switchTo().alert().accept();
//		
////		methods for pressing cancel button on alert box
		cd.switchTo().alert().dismiss();
		
		cd.quit();
		
	}
}
