//alert window with text box and ok & cancel button

package march04;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWindow3 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		
		WebDriver cd = new ChromeDriver();

		cd.navigate().to("https://demo.automationtesting.in/Alerts.html");
		cd.manage().window().maximize();

		cd.findElement(By.xpath("/html/body/div[1]/div/div/div/div[1]/ul/li[3]/a")).click();
		cd.findElement(By.xpath("//*[@id=\"Textbox\"]/button")).click();
		
		System.out.print("Enter string to input in a alert box: ");
		String str = sc.nextLine();
		cd.switchTo().alert().sendKeys(str);
		
		Thread.sleep(5000);
		
//		methods to press ok
		cd.switchTo().alert().accept();
		
//		methods to press cancel
//		cd.switchTo().alert().dismiss();
		
		Thread.sleep(5000);
		
		cd.quit();
	}
}
