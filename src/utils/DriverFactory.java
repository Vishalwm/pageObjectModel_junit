package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DriverFactory {
	static WebDriver driver;
	
	public static WebDriver startBrowser(String browser) {
//		String browser = null;
//		String driver_path = null;
//		String masterfile = "C:\\Projects\\Automation\\seleniumPractice\\datafiles\\master.csv";
//		CSVReader reader = new CSVReader();
//		List<String> rows = reader.readCSVfile(masterfile);
//		for (String field : rows) {
//			browser = field.split(",")[0];
//			driver_path = field.split(",")[1];
//		}
		
		if(browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "C:\\Projects\\Automation\\Softwares\\chromedriver.exe");
			driver =new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")){
			System.setProperty("webdriver.gecko.driver", "C:\\Projects\\Automation\\Softwares\\geckodriver.exe");
			driver =new FirefoxDriver();			
		}
		
		else if(browser.equalsIgnoreCase("edge")) {
			System.setProperty("webdriver.ie.driver", "C:\\Projects\\Automation\\Softwares\\geckodriver.exe");
			driver =new InternetExplorerDriver();
			
		}
		
		return driver;
	}

}
