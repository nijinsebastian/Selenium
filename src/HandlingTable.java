import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingTable {
	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette","C:\\Selenium_Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
		/**Select the heading of the table */
		//WebElement ele=driver.findElement(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th[1]"));
		int j=(driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"))).size();
		List<WebElement> lists=driver.findElements(By.xpath("//*[@id='leftcontainer']/table/thead/tr/th"));
		System.out.println("Total number of Columns: "+j);	
		for(WebElement eles:lists) {
			System.out.println(eles.getText());	
		}
		/**Each first row*/
		int n=(driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr"))).size();
		 lists=driver.findElements(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr"));
		System.out.println("Total number of Rows : "+n);	
		/**Print Entire rows*/
		/*for(WebElement eles:lists) {
			System.out.println(eles.getText());	
		}*/
		
		/** Print a specific range*/
		for(int i=1;i<10;i++) {
			/**From list take the values*/
			//System.out.println(lists.get(i-1).getText());	
			WebElement elee=driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td[1]/a"));
			/**Directly take the value from table*/
			System.out.println(elee.getText());
			if(i==3) {
				driver.findElement(By.xpath(".//*[@id='leftcontainer']/table/tbody/tr["+i+"]/td[1]/a")).click();
				break;
			}
		}
		
		
	}
}
