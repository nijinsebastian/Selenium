
import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FramesTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.firefox.marionette","C:\\Selenium_Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://seleniumhq.github.io/selenium/docs/api/java/index.html?overview-summary.html");
		//driver.switchTo().frame(1);
		//driver.findElement(By.linkText("Action")).click();
		//System.out.println(driver.findElements(By.tagName("frame")).size());
		//List<Integer> myList = new ArrayList<Integer>();
		//int j=driver.findElements(By.tagName("frame")).size();
		driver.switchTo().frame(1);
		driver.switchTo().parentFrame();
		//driver.switchTo().frame( driver.findElement(By.name("packagename")));
		//driver.switchTo().parentFrame();
		
	TakesScreenshot tsh=driver;
	File ne=tsh.getScreenshotAs(OutputType.FILE);
	File ll=new File("C:\\Selenium_Drivers\\Screenshots\\loop.png");
	FileUtils.copyFile(ne, ll);
		List<WebElement> web= driver.findElements(By.tagName("frame"));
		for(WebElement webb:web) {
			 System.out.println(webb.getAttribute("name"));
			}
		
		/* List<WebElement> ele = driver.findElements(By.tagName("frame"));
		   // System.out.println("Number of frames in a page :" + ele.size());
		    for(WebElement el : ele){
		      //Returns the Id of a frame.
		      //  System.out.println("Frame Id :" + el.getAttribute("id"));
		      //Returns the Name of a frame.
		        System.out.println("Frame name :" + el.getAttribute("name"));
		    }
		
		
		*/

	}

}
