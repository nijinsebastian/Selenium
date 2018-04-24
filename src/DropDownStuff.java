import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette", "C:\\Selenium_Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		WebElement web=driver.findElement(By.linkText("REGISTER"));
		driver.findElement(By.linkText("REGISTER")).click();
		Select s=new Select(driver.findElement(By.name("country")));
		s.selectByIndex(0);

	}

}
