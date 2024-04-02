package classs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class hgfjhgfhgf {
	public static void main(String[] args) {
		WebDriver cd = new ChromeDriver();
		
		cd.get("www.offlinewebsite.com\\users\\adduser.html");
		
		cd.findElement(By.xpath("xpath_of_username")).sendKeys("Username");
		cd.findElement(By.xpath("xpath_of_mobile")).sendKeys("999999999");
		cd.findElement(By.xpath("xpath_of_email")).sendKeys("abc@email.com");
		cd.findElement(By.xpath("xpath_of_courses")).sendKeys("Java/j2ee");
		cd.findElement(By.xpath("xpath_of_male")).click();
		
		WebElement state = cd.findElement(By.xpath("xpath_of_state"));
		Select s = new Select(state);
		s.selectByVisibleText("Maharashtra");
		
		cd.findElement(By.xpath("xpath_of_password")).sendKeys("password");
		
		cd.findElement(By.xpath("xpath_of_submit")).click();
	}
}
