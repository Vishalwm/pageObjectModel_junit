package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//pageobject class for customer registration
public class  RegistrationPage {
	WebDriver driver;
	WebElement register_link;
	WebElement firstName,lastName,addressBox,cityBox,stateBox,zipBox,phoneBox,SSNBox;
	WebElement usernameBox,passwordBox,confirmPasswordBox;
	WebElement register_button;
	
	
	public void click_register_link() {		
		register_link = driver.findElement(By.xpath("//a[text()='Register']"));
		register_link.click();		
		
	}
	public void setFirstname(String first_name) {
		firstName = driver.findElement(By.id("customer.firstName"));
		firstName.sendKeys(first_name);
	}
	
	public void setLastname(String last_name) {
		lastName = driver.findElement(By.id("customer.lastName"));
		lastName.sendKeys(last_name);
		
	}
	
	public void setAddress(String address) {
		addressBox = driver.findElement(By.id("customer.address.street"));
		addressBox.sendKeys(address);
	}
	
	public void setCity(String city) {
		cityBox = driver.findElement(By.id("customer.address.city"));
		cityBox.sendKeys(city);
		
	}
	
	public void setState(String state) {
		stateBox = driver.findElement(By.id("customer.address.state"));
		stateBox.sendKeys(state);
		
		
	}
	
	public void setZip(String zip) {
		zipBox = driver.findElement(By.id("customer.address.zipCode"));
		zipBox.sendKeys(zip);
		
	}
	
	public void setPhoneNum(String phone_num) {
		
	}
	
	public void setSSN(String ssn) {
		
	}
	public void setUsername(String user_name) {
		usernameBox = driver.findElement(By.id("customer.username"));
		usernameBox.sendKeys(user_name);
		
	}
	
	public void setPassword(String password) {
		passwordBox = driver.findElement(By.id("customer.password"));
		passwordBox.sendKeys(password);
		
	}
	
	public void confirmPassword(String password) {
		confirmPasswordBox = driver.findElement(By.id("repeatedPassword"));
		confirmPasswordBox.sendKeys(password);
		
	}
	
	public void click_register_button() {
		register_button = driver.findElement(By.cssSelector("input[type = 'submit']"));
		register_button.click();
	}
	
	//constructor to initialize driver
	public RegistrationPage(WebDriver driver) {
		this.driver = driver;
	}
	



}
