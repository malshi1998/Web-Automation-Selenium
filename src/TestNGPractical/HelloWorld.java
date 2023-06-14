package TestNGPractical;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HelloWorld {
	
	public String baseUrl="http://www.sliit.lk/"; 
	
	String driverPath= "C:\\\\Users\\\\INSIGHT\\\\eclipse-workspace\\\\WebAutomationSelenium\\\\ThirdPartyResource\\\\ChromeDrivers\\\\104.exe";
	public WebDriver driver;
	
  @Test
  
  public void firstTestNGMethod() {
	  
	  System.out.println("launch");
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(baseUrl);
  }
}
