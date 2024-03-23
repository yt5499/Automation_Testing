//getting window handle of single tab/window

package march05;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandleEx {
	public static void main(String[] args) {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://www.flipkart.com/");
		String str = cd.getWindowHandle();
		System.out.println(str);
		
		cd.quit();
	}
}
