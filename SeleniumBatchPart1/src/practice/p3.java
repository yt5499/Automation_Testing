package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class p3 {
	public static void main(String[] args) {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://the-internet.herokuapp.com/dropdown");
		
		WebElement dd = cd.findElement(By.xpath("//*[@id=\"dropdown\"]"));
		
		Select sDD = new Select(dd);
		
		sDD.selectByValue("2");
	}
}
