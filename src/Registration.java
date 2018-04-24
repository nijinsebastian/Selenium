import org.openqa.selenium.firefox.FirefoxDriver;

public interface Registration {
	void addFirstName(FirefoxDriver driver,String s);
	void addLastName(FirefoxDriver driver,String s);
	void addPhoneNum(FirefoxDriver driver,String s);
	void addEmail(FirefoxDriver driver,String s);
	void addAddress(FirefoxDriver driver,String s);
	void addCity(FirefoxDriver driver,String s);
	void addProvince(FirefoxDriver driver,String s);
	void addPostalCode(FirefoxDriver driver,String s);
	void selectCountry(FirefoxDriver driver,String s);
	void addUserName(FirefoxDriver driver,String s);
	void password(FirefoxDriver driver,String s);
	void confirmPassword(FirefoxDriver driver,String s);
	
	

}
