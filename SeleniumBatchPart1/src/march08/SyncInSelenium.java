//Synchronization in selenium: 
//	Is a state when your script is executed fully/completely but your web page is still loading,
//	 this situation creates miscommunication between your script & web page which you are testing.
//	It can be handled by 2 ways:
//		1. Implicit wait - is applied gloabally to all elements present on web page
//		2. Explicit wait - is applied to perticular/single element on web page

package march08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyncInSelenium {
	public static void main(String[] args) {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		cd.manage().window().maximize();
		
//		entering username
		cd.findElement(By.name("username")).sendKeys("Admin");
//		entering password
		cd.findElement(By.name("password")).sendKeys("admin123");
//		logging in
		cd.findElement(By.cssSelector("button[type='submit']")).click();
	}
}
