//alertbox with text box and ok, cancel

package march23;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertEx3 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		WebDriver cd = new ChromeDriver();

		cd.get("https://demo.automationtesting.in/Alerts.html");
		cd.manage().window().maximize();
		
		cd.findElement(By.cssSelector(".analystic[href='#Textbox']")).click();
		cd.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		System.out.print("Enter your string: ");
		String str = sc.next();
		
		Thread.sleep(3000);
		
		cd.switchTo().alert().sendKeys(str);
		
		
		cd.switchTo().alert().accept();
//		cd.switchTo().alert().dismiss();
		
		Thread.sleep(3000);
		
		cd.quit();
	}

}
