package march02;

import org.openqa.selenium.chrome.ChromeDriver;

public class Main {
	public static void main(String[] args) {
//		step1: invoke the browser(any)
//		follow webdriver hirarchy
		ChromeDriver cd = new ChromeDriver();
		
//		then open any target URL
		cd.get("https://www.amazon.in/");
		
		String title = cd.getTitle();
		System.out.println("Title: "+title);
		
	}
}
