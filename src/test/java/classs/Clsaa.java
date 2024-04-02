package classs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Clsaa {
//	public static void main(String[] args) {
//		WebDriver cd = new ChromeDriver();
//		
//		cd.get("https://www.makemytrip.com/");
//		
//		String expectedTitle = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
//		
//		String actualTitle = cd.getTitle();
//		
//		if(actualTitle == expectedTitle) {
//			System.out.println("Appropriate Result.");
//		}else {
//			System.out.println("Inappropriate Result.");			
//		}
//	}
	
	WebDriver cd;
	String baseURL = "https://www.makemytrip.com/";
	
	@BeforeTest
	public void setup() {
		cd = new ChromeDriver();
		cd.get(baseURL);
	}
	
	@AfterTest
	public void end() {
		cd.quit();
	}
	
//	1 write Test case for Page title is appropriate vissible expected result is 
//		"MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday"
	@Test
	public void Testcase1() {
		String expectedTitle = "MakeMyTrip - #1 Travel Website 50% OFF on Hotels, Flights & Holiday";
		String actualTitle = cd.getTitle();
		
		Assert.assertEquals(actualTitle, expectedTitle);
	}
	
//	2 Write test case for display label on login button expected result is "Login or Create Account"
	@Test
	public void Testcase2() {
		String expectedText = "Login or Create Account";
		String buttonText = cd.findElement(By.xpath("//*[@id=\"SW\"]/div[1]/div[1]/ul/li[4]/div/p")).getText();
		
		Assert.assertEquals(buttonText, expectedText);
	}
	
//	3 write a test case to automate search button only perform click action in test case method
	@Test
	public void Testcase3() {
		cd.findElement(By.linkText("Search")).click();
	}	
}
