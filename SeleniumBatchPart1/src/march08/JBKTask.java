//Q. Test Case - Open jbktutorials.com and Validate Page Title
//
//Steps to Automate:
//	1. Launch the browser chrome using Selenium WebDriver.
//	2. Open this URL - https://www.jbktutorials.com/
//	3. Maximize or set the size of the browser window.
//	4. Get the Title of the page and validate it with the expected value.
//	5. Get the URL of the current page and validate it with the expected value.
//	6. Get the Page source of the web page.
//	7.Close the browser.

package march08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JBKTask {
	public static void main(String[] args) {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://www.jbktutorials.com/");
		cd.manage().window().maximize();
		
//		get current tile of page
		String currentTitle = cd.getTitle();
		String expectedTitle = "JBK Tutorials | Java | Selenium | Python";
		
//		validating the title
		if(currentTitle.equals(expectedTitle)) {
			System.out.println("Title matched!");
		}else {
			System.out.println("Title wrong!");
		}
		
//		getting url
		String currentURL = cd.getCurrentUrl();
		String expectedURL = "//https://www.jbktutorials.com/#gsc.tab=0";
		
//		validating the url
		if(currentURL.equals(expectedURL)) {
			System.out.println("URL matched!");
		}else {
			System.out.println("URL wrong!");
		}
		
//		getting page source
		System.out.println("Current page source:\n"+cd.getPageSource());	
	}
}
