package march24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGEx {
	@Test
	public void Testcase1() {
		WebDriver cd = new ChromeDriver();
		cd.get("https://www.opencart.com/");
		
		String act = cd.getTitle();
		String exp = "OpenCart - Open Source Shopping Cart Solution";
		
		Assert.assertEquals(act, exp);
		
		cd.close();
	}
}
