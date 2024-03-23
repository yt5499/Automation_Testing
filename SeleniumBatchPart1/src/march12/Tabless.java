//In this code, the loops for iterating over rows and columns in the table start from 1 because 
//in XPath, indexes typically start from 1, not from 0 as in many programming languages.

package march12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tabless {
	public static void main(String[] args) {
		WebDriver cd = new ChromeDriver();
		
		cd.get("https://the-internet.herokuapp.com/tables");
		cd.manage().window().maximize();
		
		List<WebElement> rows = cd.findElements(By.xpath("//table[@id='table1']//tbody/tr"));
		List<WebElement> columns = cd.findElements(By.xpath("//table[@id='table1']//th"));
		
		System.out.println("Number of rows: "+rows.size());
		System.out.println("Number of columns: "+columns.size());
		
		for(int i=1 ; i<=rows.size() ; i++) {
			for(int j=1 ; j<=columns.size() ; j++) {
//				custom xpath
				String td = cd.findElement(By.xpath("//table[@id='table1']//tbody/tr["+i+"]/td["+j+"]")).getText();
				System.out.print(td+"	");
			}
			System.out.println();
		}
		
	}
}
