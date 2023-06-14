package WebPageTestClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import WebPageClass.Factory_FaceBookLoginPage;

public class Factory_FaceBookTestClas {
  
	
	String drivepath="C:\\Users\\INSIGHT\\eclipse-workspace\\TestNGProject1\\ThirdPartyResources\\ChromeDriver\\105.exe";
	
	@Test
	public void verifyLogin() {
		
		System.setProperty("webdriver.chrome.driver", drivepath);
		WebDriver Chromedriver= new ChromeDriver();
		Chromedriver.manage().window().maximize();
		Chromedriver.get("https://www.facebook.com/");
		
		//created page object using page factory
		Factory_FaceBookLoginPage pageUsingPageFactory= PageFactory.initElements(Chromedriver,Factory_FaceBookLoginPage.class);
	
		pageUsingPageFactory.Validatelogin("chandana","1234");
	}
	
}
