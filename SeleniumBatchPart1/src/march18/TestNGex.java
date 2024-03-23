package march18;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNGex {
	@Test
	void testCase1() {
		WebDriver cd = new ChromeDriver();
		cd.navigate().to("https://www.amazon.in/");
		cd.findElement(By.xpath("//*[@id=\"nav-cart\"]")).click();
	}
	@Test
	void testCase2() {
		WebDriver cd = new ChromeDriver();
		cd.navigate().to("https://www.amazon.in/");
		cd.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[4]")).click();
	}
}
