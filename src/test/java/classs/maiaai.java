package classs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class maiaai {
	public static void main(String[] args) {
		WebDriver cd = new ChromeDriver();

		cd.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		cd.findElement(By.xpath("xpath_of_username")).sendKeys("username");
		cd.findElement(By.xpath("xpath_of_password")).sendKeys("password");
		
		cd.findElement(By.xpath("xpath_of_signinbutton")).click();
	}
}
