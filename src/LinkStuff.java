import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette", "C:\\Selenium_Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.manage().timeouts().implicitlyWait(1,TimeUnit.SECONDS);
		//String parentwindow=driver.getWindowHandle();
		List<WebElement> links=driver.findElements(By.tagName("a"));
		List<String> link=new ArrayList<String>();
		for(WebElement elements:links) {
			//System.out.println(elements.getText());
			link.add(elements.getText());
		}
	for(String linkss:link) {
			driver.findElement(By.linkText(linkss)).click();
			System.out.println("link name : "+linkss+" link title : "+driver.getTitle());
			driver.navigate().back();
	}

}
}
