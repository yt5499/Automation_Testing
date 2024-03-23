package march23;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHan2 {
	public static void main(String[] args) {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://www.flipkart.com/");
		cd.manage().window().maximize();
		
		cd.findElement(By.linkText("Myntra")).click();
		
		Set<String> ids = cd.getWindowHandles();
		
		Iterator<String> it = ids.iterator();
		String flipkartID = it.next();
		System.out.println("FlipKart window ID: "+flipkartID);
		String MyntraID = it.next();
		System.out.println("Myntra window ID: "+MyntraID);
		
		System.out.println("URL of current window where driver is present: "+cd.getCurrentUrl());
		
		cd.switchTo().window(MyntraID);
		
		System.out.println("URL of current window where driver is present: "+cd.getCurrentUrl());
		
		cd.quit();
		
	}
}
