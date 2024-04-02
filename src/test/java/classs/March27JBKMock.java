package classs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class March27JBKMock {
	public static void main(String[] args) {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://www.amazon.in/");
		cd.manage().window().maximize();
		
		String str = cd.findElement(By.xpath("//*[@id=\"glow-ingress-line2\"]")).getText();
		
		System.out.println(str);
	}
}
