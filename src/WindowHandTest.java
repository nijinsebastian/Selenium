import java.util.ArrayList;
		import java.util.List;
		import java.util.Set;

		import org.openqa.selenium.By;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
public class WindowHandTest {

	public static void main(String[] args) {
		

		
		      
		System.setProperty("webdriver.firefox.marionette","C:\\Selenium_Drivers\\geckodriver.exe");
		   
		   FirefoxDriver driver = new FirefoxDriver();
		    
		    driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
		    
		  /*  driver.manage().window().maximize();
		    
		    String firstwindowname = driver.getWindowHandle();
		    
		    System.out.println(firstwindowname); */
		    
		    driver.findElement(By.id("button1")).click();
		   
		    
		    driver.manage().window().maximize();
		    
		    Set<String> windows = driver.getWindowHandles();
		  
		    
		    List l1 = new ArrayList();
		
		   // Set s1 = new Set();
		    for(String s : windows)
		    {
		        
		System.out.println(s);
		l1.add(s);

		    }
		  
		    //driver.switchTo().window("cf43a5b1-ed0a-49eb-96e3-6cf6cfe59d92");
		    String s1 = l1.get(1).toString();
		    driver.switchTo().window(s1);
		    driver.manage().window().maximize();
		    System.out.println("The second window title is"+driver.getTitle());
		    driver.switchTo().window(l1.get(0).toString());
		    System.out.println("The Parent window title is"+driver.getTitle());
		    
		   // String title = driver.getTitle();
		    
		   // System.out.println(title);
		    
		   
		

	}

}
