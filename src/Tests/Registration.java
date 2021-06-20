package Tests;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
import org.openqa.selenium.WebDriver;

import pageobject.LoginPage;
import pageobject.RegistrationPage;


//junit parameterized Test to handle larger sets of data available in csv format
//registers customer and validates by logging in

@RunWith(Parameterized.class)
public class Registration {
	
	//Declare data and class variable here.
	WebDriver driver;
	RegistrationPage homepage;
	LoginPage loginPage;
	private String firstName;
	private String lastName;
	private String city;
	private String address;
	private String state;
	private String zip;
	private String username;
	private String password;
	
	//read all parameters from CSV file
	@Parameters
	public static List<String[]> getData(){
		return utils.CSVReader.readCSVfile("C:\\Projects\\Automation\\DataFiles\\registration_data.csv");
	}
	
	public  Registration(String firstName,String lastName,String address,String city,String zip,String state,String username,String password) {
		// TODO Auto-generated constructor stub
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.zip = zip;
		this.state = state;
		this.username = username;
		this.password = password;
		
	}
	@Before
	public void setup() {
		driver = utils.DriverFactory.startBrowser("chrome");
		homepage = new RegistrationPage(driver);
		driver.manage().window().maximize();
		driver.get("https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC");
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		System.out.println("Page Title: "+driver.getTitle());
		
	}
	@Test
	public void register() {
		//test code
		System.out.println("Adding record for "+firstName+","+lastName);
		homepage.click_register_link();	
		homepage.setFirstname(firstName);
		homepage.setLastname(lastName);
		homepage.setAddress(address);
		homepage.setCity(city);
		homepage.setState(state);
		homepage.setZip(zip);
		homepage.setUsername(username);
		homepage.setPassword(password);
		homepage.confirmPassword(password);
		homepage.click_register_button();	
		
		
	}
	
	@Test
	public void login() {
		System.out.println("Logging in with---\n"+username+","+password);
		loginPage = new LoginPage(driver);
		loginPage.set_user_name(username);
		loginPage.set_password(password);
		loginPage.click_login_button();
	}
	
	@After
	public void teardown() {
		driver.quit();
		
	}

}
