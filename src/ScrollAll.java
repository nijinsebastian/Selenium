import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ScrollAll {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","C:\\Selenium_Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.linkedin.com/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		//List<WebElement> links=driver.findElements(By.tagName("a"));
		/**Scroll from top to bottom of page and click the item*/
		//((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
		WebElement element=driver.findElement(By.linkText("Learning"));
		
		/**Scroll from top to particular item*/
		//((JavascriptExecutor)driver).executeScript("argument[1].scrollIntoView()",element);
		Point p=element.getLocation();
		System.out.println("x co-ordinate : "+p.getX()+"x co-ordinate : "+p.getY());
		String s="window.scrollBy("+p.getX()+","+p.getY()+")";
		((JavascriptExecutor)driver).executeScript(s);
		element.click();
		/*List<String> link=new ArrayList<String>();
		for(WebElement elements:links) {
			//System.out.println(elements.getText());
			link.add(elements.getText());
		}*/

	}

}
