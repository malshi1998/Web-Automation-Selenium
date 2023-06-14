package WebPageTestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import WebPageClass.faceBookLoginClass;



public class WordPressLoginTestClass {
  
	String drivepath="C:\\Users\\INSIGHT\\eclipse-workspace\\TestNGProject1\\ThirdPartyResources\\ChromeDriver\\105.exe";
	
	@Test(priority=1)
	
	public void WordPressLoginPageVerifyValidLogin() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", drivepath);
		WebDriver TestClassChromeDriver= new ChromeDriver();
		TestClassChromeDriver.manage().window().maximize();
		TestClassChromeDriver.get("http://www.facebook.com/");
		
		//Constructor method from web page class
		faceBookLoginClass faceBookLoginwebPageObject= new faceBookLoginClass(TestClassChromeDriver);
	
		faceBookLoginwebPageObject.passingValuestoUsernamePassword("Malshi","mal@123");
	
		Thread.sleep(5000);
		
		faceBookLoginwebPageObject.clickLoginButton();
	}
}
