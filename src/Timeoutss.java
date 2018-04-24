
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Timeoutss {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette","C:\\Selenium_Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		   WebDriverWait wait=new WebDriverWait(driver,10);
		//driver.manage().timeouts().implicitlyWait(100, TimeUnit.MILLISECONDS);
		   WebElement buton;
		   buton=wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.id("button1"))));
		   buton.click();
		   System.out.print(driver.getTitle()+buton);
		   TakesScreenshot src=(TakesScreenshot)driver;
		   File srcFile=src.getScreenshotAs(OutputType.FILE);
		   File dest=new File("C:\\Selenium_Drivers\\Screenshots\\nijin1.png");
		   FileUtils.copyFile(srcFile, dest);
		   //FileUtils.copyFile(srcFile,dest);
		  
		
		   
		
		   
		   
		   
		   
	}

}
