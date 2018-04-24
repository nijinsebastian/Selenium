import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class SlectionMultiple {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette", "C:\\Selenium_Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		/** Go to the website http://newtours.demoaut.com/*/
		driver.get("http://output.jsbin.com/osebed/2");
		Select s=new Select(driver.findElement(By.id("fruits")));
		System.out.println(s.isMultiple());
		
	}

}
