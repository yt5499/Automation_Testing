package march02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main2 {
	public static void main(String[] args) {
		WebDriver cd = new ChromeDriver();
//		we used WebDriver to not make access restricted to any specific browser
		
		cd.get("https://www.amazon.in/");
		
//		System.out.println(cd.getPageSource());
		
		cd.manage().window().maximize();
	}
}
