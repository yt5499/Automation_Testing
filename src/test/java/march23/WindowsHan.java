//getting window/tab id

package march23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHan {
	public static void main(String[] args) {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://www.flipkart.com/");
		cd.manage().window().maximize();
		
		cd.findElement(By.linkText("Myntra")).click();
		
		System.out.println(cd.getWindowHandle());
	}
}
