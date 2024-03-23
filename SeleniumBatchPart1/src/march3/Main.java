package march3;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	public static void main(String[] args) {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://jbktest.com/");
	}
}
