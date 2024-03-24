package march24;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGEx3 {
	WebDriver cd;
	String url = "https://demo.opencart.com/";
	
	@BeforeTest
	public void setup() {
		cd = new ChromeDriver();
		cd.get(url);
	}
	
	@AfterTest
	public void outtro() {
		cd.quit();
	}
	
	@Test
	public void testcase1() {
		System.out.println("Current URL: "+cd.getCurrentUrl());
	}
	
	@Test
	public void testcase2() {
		System.out.println("Current title: "+cd.getTitle());
	}
}
