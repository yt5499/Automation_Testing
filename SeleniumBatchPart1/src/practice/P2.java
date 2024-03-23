package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2 {
	public static void main(String[] args) {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://the-internet.herokuapp.com/checkboxes");
		cd.manage().window().maximize();
		
		cd.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
		
		cd.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();
		
	}
}
