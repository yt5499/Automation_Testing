package classs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tests {
	public static void main(String[] args) {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		String title = cd.getTitle();
		
		System.out.println("Title of page is: "+title);
	}
}
