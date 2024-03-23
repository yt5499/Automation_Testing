package march12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabless2 {
	public static void main(String[] args) throws Exception {
		WebDriver cd = new ChromeDriver();
		
		cd.navigate().to("https://the-internet.herokuapp.com/tables");
		cd.manage().window().maximize();
		
		List<WebElement> rows = cd.findElements(By.xpath("//table[@id='table2']//tbody/tr"));
		List<WebElement> columns = cd.findElements(By.xpath("//table[@id='table2']//thead//th"));
		
		System.out.println("Number of rows are "+rows.size()+" & columns are "+columns.size());
		
		for(int row=1 ; row<=rows.size() ; row++) {
			for(int col=1 ; col<columns.size() ; col++) {
				String td = cd.findElement(By.xpath("//table[@id='table2']//tbody/tr["+row+"]/td["+col+"]")).getText();
				System.out.print(td+"		");
			}
			System.out.println();
		}
		
		Thread.sleep(3000);
		cd.quit();
	}
}
