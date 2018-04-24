import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Alerttest {

	public static void main(String[] args) {
		boolean selected=true;
		System.setProperty("webdriver.firefox.marionette", "C:\\Selenium_Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://output.jsbin.com/usidix/1");
		driver.findElement(By.xpath("html/body/input")).click();
		Alert alert1=driver.switchTo().alert();
		//driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
		WebDriverWait wait=new WebDriverWait(driver,10);
		Boolean ll=wait.until(ExpectedConditions.elementSelectionStateToBe((driver.findElement(By.xpath("html/body/input"))), selected));
		String s=driver.switchTo().alert().getText();
		System.out.println(s);
		alert1.dismiss();
		alert1.sendKeys("nijin");
	}

}
