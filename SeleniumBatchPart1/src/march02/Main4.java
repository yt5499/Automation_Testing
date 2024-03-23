//Automating amazon webpage

package march02;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		WebDriver cd = new ChromeDriver();
		
		cd.navigate().to("https://www.amazon.in/");
		cd.manage().window().maximize();
		
//		navigating to singn in page
		cd.findElement(By.id("nav-link-accountList")).click();
		
//		entering email id and pressing continue button
		cd.findElement(By.id("ap_email")).sendKeys("user@amazon.com");
		cd.findElement(By.id("continue")).click();
		
//		entering password
		cd.findElement(By.id("ap_password")).sendKeys("amazon@WebApp");
		cd.findElement(By.id("signInSubmit")).click();
		
//		entering captcha and submitting
		System.out.print("Enter captcha from amazon page: ");
		String captcha = sc.next();
		
		cd.findElement(By.name("cvf_captcha_input")).sendKeys(captcha);
		cd.findElement(By.name("cvf_captcha_captcha_action")).click();
		
//		otp verification
		System.out.print("Enter otp: ");
		int otp = sc.nextInt();
		
		cd.findElement(By.id("input-box-otp")).sendKeys(String.valueOf(otp));
		cd.findElement(By.xpath("//*[@id=\"cvf-submit-otp-button\"]/span/input")).click();
		
	}
}