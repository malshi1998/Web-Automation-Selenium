package SeleniumWithTestNGAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class hrmTwo {
	
	
	
	// 1.Setup chrome driver configuration
		public String baseUrl="https://opensource-demo.orangehrmlive.com/web/index.php/pim/viewEmployeeList"; 
		String driverPath= "C:\\Users\\INSIGHT\\eclipse-workspace\\TestNGProject1\\ThirdPartyResources\\ChromeDriver\\105.exe";
		public WebDriver driver;
		
		@BeforeTest
		//Call the browser
		public void callBrowser() throws InterruptedException {
			
			System.setProperty("webdriver.chrome.driver", driverPath);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(baseUrl);
			Thread.sleep(10000);
			System.out.println("The browser run seccessfully");
		}
		//Automate Employee Information
		
		@Test(priority=6)
		
		//Check users can enter the Employee name and ID
		public void EmployeeInformation() throws InterruptedException {
			
			WebElement textboxEmployeeName= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
			textboxEmployeeName.sendKeys("Nimal");
			System.out.println("Employee Name added successfuly");
			Thread.sleep(5000);
			
			WebElement textboxemployeeID= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
			textboxemployeeID.sendKeys("1234");
			System.out.println("Employee ID added successfuly");
			Thread.sleep(5000);
			
		}
		
		
		//Check users can search without adding Employee Name and Password
		@Test(priority=7)
		public void WithoutEmployeeInformation() throws InterruptedException {
			
			WebElement textboxEmployeeName= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input"));
			textboxEmployeeName.sendKeys("");
			System.out.println("Employee Name added successfuly");
			Thread.sleep(5000);
			
			WebElement textboxemployeeID= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input"));
			textboxemployeeID.sendKeys("");
			System.out.println("Employee ID added successfuly");
			Thread.sleep(5000);
			
			WebElement buttontoggle=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]"));
			buttontoggle.click();
			Thread.sleep(5000);
			System.out.println("search successfully.");
			
			
			
		}
}
