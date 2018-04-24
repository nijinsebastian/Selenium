import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumProgram1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette","C:\\Selenium_Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.linkText("SIGN-ON")).click();;
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
		//System.out.println(driver.getTitle());
		//String actualTitle=driver.getTitle();
		/*String expectedTitle="Welcome: Mercury Tour";
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click();
		System.out.println(driver.getTitle());*/
		/*if (expectedTitle.equals(actualTitle)) {
			System.out.println("TRUE");
		}
		else
		{
			System.out.println("FALSE");
		}*/
		//driver.close();
	}

}
