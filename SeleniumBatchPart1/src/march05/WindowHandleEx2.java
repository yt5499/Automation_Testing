package march05;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleEx2 {
	public static void main(String[] args) {
		WebDriver cd = new ChromeDriver();
		
		cd.navigate().to("https://www.flipkart.com/");
		
		cd.findElement(By.linkText("Myntra")).click();
		
//		getting all windows id and storing it in a set
		Set<String> windowHandleID = cd.getWindowHandles();
		System.out.println(windowHandleID);
		
		Iterator<String> it = windowHandleID.iterator();
		
//		moving to first string value stored in iterator 
		String firstTabID = it.next();
		System.out.println("Flipkart window id: "+firstTabID);
		
//		moving to second string value stored in iterator 
		String secondTabID = it.next();
		System.out.println("Myntra window id: "+secondTabID);
		
//		checking in which tab/window original driver control was present 
		System.out.println("URL where original driver was present: "+cd.getCurrentUrl());
		
//		switching driver control from one tab/window to another tab/window
		cd.switchTo().window(secondTabID);
		
//		checking current driver control
		System.out.println("URL where curent driver control is present: "+cd.getCurrentUrl());
		
//		making changes on second window where current driver is present
		cd.findElement(By.xpath("//*[@id=\"desktop-header-cnt\"]/div[2]/div[3]/input")).sendKeys("Laptop", Keys.ENTER);
		
		cd.quit();
	}
}
