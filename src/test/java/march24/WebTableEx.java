package march24;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableEx {
	public static void main(String[] args) {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://the-internet.herokuapp.com/tables");
		cd.manage().window().maximize();
		
		List<WebElement> cols = cd.findElements(By.xpath("//table[@id='table1']/thead/tr/th"));
		List<WebElement> rows = cd.findElements(By.xpath("//table[@id='table1']/tbody/tr"));
		
		System.out.println(cols.size());
		System.out.println(rows.size());
		
		for(int r=1 ; r<=rows.size() ; r++) {
			for(int c=1 ; c<cols.size() ; c++) {
				String td = cd.findElement(By.xpath("//table[@id='table1']/tbody/tr["+r+"]/td["+c+"]")).getText();
				System.out.print(td+"		");
			}
			System.out.println();
		}
	}
}
