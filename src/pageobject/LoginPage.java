package pageobject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
	//Declare elements and driver.
	WebDriver driver;
	WebElement userNameBox, passwordBox, loginButton;
	
	//enter username into username field
	public void set_user_name(String username) {
		userNameBox = driver.findElement(By.name("username"));
		userNameBox.sendKeys(username);
	}
	
	//enter passord
	public void set_password(String password) {
		passwordBox = driver.findElement(By.name("password"));
		passwordBox.sendKeys(password);
	}

	//click login
	public void click_login_button() {
		loginButton = driver.findElement(By.cssSelector("input[value='Log In']"));
		loginButton.click();
	}
	
	//constructor takes driver parameter and initialize driver
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}

}
