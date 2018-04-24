import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class RegTest implements Registration{

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette", "C:\\Selenium_Drivers\\geckodriver.exe");
		FirefoxDriver driver=new FirefoxDriver();
		/** Go to the website http://newtours.demoaut.com/*/
		driver.get("http://newtours.demoaut.com/");
		/** Click the REGISTER Link*/
		driver.findElement(By.partialLinkText("REGISTER")).click();
		String title=driver.getTitle();
		
		String actualTitle="Register: Mercury Tours";
		/**Checking the title of the webpage*/
		if(title.equals(actualTitle)) {
			System.out.println("Title is OK");			
		}
		else {
			System.out.println("Title is not matched");	
		}
		/**Registration Process*/
		RegTest reg=new RegTest();
		driver=reg.registrationStarts(driver, "Rahul", "Lal", "5146936689", "rahullal@gmail.com", "12 mathieu", "montreal", "QC", "H7U8I9", "CANADA", "rahul", "rahul1234", "rahul1234");
		/**Check Registration Successful*/
		reg.regSuccessful(driver);
		
		
		

	}
	public void regSuccessful(FirefoxDriver driver) {
		String currentUrl=driver.getCurrentUrl();
		if(currentUrl.contains("success")) {
			
			System.out.println("Registration Success");		
		}
		else {

			System.out.println("Registration Fail");		
		}
		
	}
	public FirefoxDriver registrationStarts(FirefoxDriver driver,String firstName, String lastName, String phone, String email, String address, String city, String state, String postalCode,String country,String userName, String password, String confirmPassword) {
		
		addFirstName(driver, firstName);
		addLastName(driver, lastName);
		addPhoneNum(driver,phone);
		addEmail(driver, email);
		addAddress(driver,address);
		addCity(driver, city);
		addProvince(driver, state);
		addPostalCode(driver, postalCode);
		selectCountry(driver, country);
		addUserName(driver, userName);
		password(driver, password);
		confirmPassword(driver, confirmPassword);
		if(password.equals(confirmPassword)) {
			System.out.println("Password Match");	
		driver.findElement(By.name("register")).click();
		}
		else {
			System.out.println("Password doesn't Match");
		}
		return driver;
		
	}

	@Override
	public void addFirstName(FirefoxDriver driver, String s) {
		WebElement firstName=driver.findElement(By.name("firstName"));
		firstName.sendKeys(s);
		
	}

	@Override
	public void addLastName(FirefoxDriver driver, String s) {
		WebElement firstName=driver.findElement(By.name("lastName"));
		firstName.sendKeys(s);
		
	}

	@Override
	public void addPhoneNum(FirefoxDriver driver, String s) {
		WebElement firstName=driver.findElement(By.name("phone"));
		firstName.sendKeys(s);
		
	}

	@Override
	public void addEmail(FirefoxDriver driver, String s) {
		WebElement firstName=driver.findElement(By.name("userName"));
		firstName.sendKeys(s);
		
	}

	@Override
	public void addAddress(FirefoxDriver driver, String s) {
		WebElement firstName=driver.findElement(By.name("address1"));
		firstName.sendKeys(s);
	}

	@Override
	public void addCity(FirefoxDriver driver, String s) {
		WebElement firstName=driver.findElement(By.name("city"));
		firstName.sendKeys(s);
		
	}

	@Override
	public void addProvince(FirefoxDriver driver, String s) {
		WebElement firstName=driver.findElement(By.name("state"));
		firstName.sendKeys(s);
		
	}

	@Override
	public void addPostalCode(FirefoxDriver driver, String s) {
		WebElement firstName=driver.findElement(By.name("postalCode"));
		firstName.sendKeys(s);
		
	}

	@Override
	public void selectCountry(FirefoxDriver driver, String s) {
		Select country=new Select(driver.findElement(By.name("country")));
		country.selectByVisibleText(s);	
		System.out.println(country.isMultiple());
	}

	@Override
	public void addUserName(FirefoxDriver driver, String s) {
		WebElement firstName=driver.findElement(By.name("email"));
		firstName.sendKeys(s);
		
	}

	@Override
	public void password(FirefoxDriver driver, String s) {
		WebElement firstName=driver.findElement(By.name("password"));
		firstName.sendKeys(s);
		
		
	}

	@Override
	public void confirmPassword(FirefoxDriver driver, String s) {
		WebElement firstName=driver.findElement(By.name("confirmPassword"));
		firstName.sendKeys(s);
		
	}

	
	

}
