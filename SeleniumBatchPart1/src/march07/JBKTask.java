//Q. 2. Test Case - Open jbktutorials.com and Print its Page title. 
//Steps to Automate:
//	1. Launch the browser chrome using Selenium WebDriver.
//	2. Open this URL - https://www.jbktutorials.com/
//	3. Maximize the size of the browser window.
//	4. Get the Title of the page and print it.
//	5. Get the URL of the current page and print it.
//	6. Close the browser.

package march07;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JBKTask {
	public static void main(String[] args) throws Exception {
//		invoking the browser
		WebDriver cd = new ChromeDriver();
		
//		opening url on the browser
		cd.get("https://www.jbktutorials.com/");
//		maximizing window size
		cd.manage().window().maximize();
		
		System.out.println("Title of current page: "+cd.getTitle());
		System.out.println("URL of current page: "+cd.getCurrentUrl());
		
		Thread.sleep(5000);
		
		cd.close();
	}
}
