package SeleniumWithTestNGAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrgHRMTestingClass {

	// 1.Setup chrome driver configuration
	public String baseUrl = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	String driverPath = "C:\\Users\\INSIGHT\\eclipse-workspace\\TestNGProject1\\ThirdPartyResources\\ChromeDriver\\105.exe";
	public WebDriver driver;

	@BeforeTest
	// Call the browser
	public void callBrowser() throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(baseUrl);
		Thread.sleep(10000);
		System.out.println("The browser run seccessfully");
	}

	
	  @Test(priority=1) public void loginValidationWithoutCredintials() throws
	  InterruptedException { 
	  WebElement textboxusername=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")); 
	  textboxusername.sendKeys(""); 
	  Thread.sleep(5000);
	  
	  WebElement textboxpassword= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")); 
	  textboxpassword.sendKeys(""); 
	  Thread.sleep(5000);
	  
	  if((textboxusername!=null)&& (textboxpassword!=null)) {
	  System.out.println("Please Enteer the userName and Password");
	  
	  }else System.out.println("Login successfull.");
	  
	  
	  WebElement buttonlogin=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	  buttonlogin.click(); Thread.sleep(5000);
	  
	  
	  }
	 

	
	  @Test(priority=2)
	  
	  public void loginValidationWithoutUsername() throws InterruptedException {
	  WebElement textboxusername= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")); 
	  textboxusername.sendKeys(""); 
	  Thread.sleep(5000);
	  
	  WebElement textboxpassword= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")); 
	  textboxpassword.sendKeys("admin123");
	  System.out.println("Password added successfuly"); 
	  Thread.sleep(5000);
	  
	  if(textboxusername!=null) { System.out.println("Please Enteer the userName");
	  
	  }else System.out.println("Login successfull.");
	  
	  
	  WebElement buttonlogin=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	  buttonlogin.click();
	  Thread.sleep(5000);
	  
	  
	  
	  
	  }
	 

	
	  @Test(priority=3)
	  
	  public void loginValidationWithoutPassword() throws InterruptedException {
	  WebElement textboxusername= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")); 
	  textboxusername.sendKeys("Admin");
	  System.out.println("User name added successfuly"); 
	  Thread.sleep(5000);
	  
	  WebElement textboxpassword= driver.findElement(By.xpath( "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")); 
	  textboxpassword.sendKeys(""); 
	  Thread.sleep(5000);
	  
	  if(textboxpassword!=null) { System.out.println("Please Enteer the Password");
	  
	  }else System.out.println("Login successfull.");
	  
	  
	  WebElement buttonlogin=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
	  buttonlogin.click(); Thread.sleep(5000);
	  
	  
	  }
	 
	  

	@Test(priority = 4)

	public void loginValidation() throws InterruptedException {
		WebElement textboxusername = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
		textboxusername.sendKeys("Admin");
		System.out.println("User name added successfuly");
		Thread.sleep(5000);

		WebElement textboxpassword = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input"));
		textboxpassword.sendKeys("admin123");
		System.out.println("Password added successfuly");
		Thread.sleep(5000);

		WebElement buttonlogin = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"));
		buttonlogin.click();
		System.out.println("User logged in successfully");
		Thread.sleep(5000);

	}

	// Check whether toggle button is working or not

	
	  @Test(priority = 5) public void toggleButtonValidation() throws
	  InterruptedException {
	  
	  WebElement buttontoggle = driver .findElement(By.xpath( "//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/div/div/button"));
	  buttontoggle.click(); 
	  Thread.sleep(5000);
	  System.out.println("Toggle In successfully.");
	  
	  }
	 
	// Automate Employee Information

	
	  @Test(priority = 6) // Check users can enter the Employee name and ID
	  
	  public void EmployeeInformation() throws InterruptedException {
	  
	  WebElement textboxEmployeeName = driver.findElement(By.xpath( "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[1]/div/div[2]/div/div/input")); 
	  textboxEmployeeName.sendKeys("Nimal");
	  System.out.println("Employee Name added successfuly"); 
	  Thread.sleep(5000);
	  
	  WebElement textboxemployeeID = driver.findElement(By.xpath( "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[2]/div/div[2]/input")); 
	  textboxemployeeID.sendKeys("ABC1234");
	  System.out.println("Employee ID added successfuly"); 
	  Thread.sleep(5000); }
	 
	 

	
	
	  @Test(priority=7) 
	  
	  public void checkdropdownmenu() throws InterruptedException {
		  WebElement buttonDropdown=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div/div[2]/i")); 
		  buttonDropdown.click(); 
		  System.out.println("Drop down List is selected");
		  Thread.sleep(5000);
	  
	  
	  
		  Select Employee_status=new Select (driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[3]/div/div[2]/div/div"))); 
		  Employee_status.selectByVisibleText("Freelance");
		  System.out.println("Index 3 has selected"); 
		  Thread.sleep(5000);
	  
	  }
	  
	 
	  
	  
	  
	
	
	  @Test(priority=8) 
	  
	  public void CheckSuperivsorName() throws InterruptedException{
	  
	  WebElement textboxSupervisorName= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[5]/div/div[2]/div/div/input")); 
	  textboxSupervisorName.sendKeys("Kamal Perera");
	  System.out.println("Supervisor Name added successfuly"); 
	  Thread.sleep(5000);
	  }
	 
		  
	
	  @Test(priority=9) 
	  
	  public void checkdropdownmenuJobTitle() throws InterruptedException {
		  WebElement buttonDropdownjobtitle=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div/div[2]/i" )); 
		  buttonDropdownjobtitle.click();
		  System.out.println("Job Title Drop down List is selected");
		  Thread.sleep(5000); }
	 
	
	  
	  @Test(priority=10) 
	  
	  public void checkdropdownmenusubUnit() throws InterruptedException { 
		  WebElement buttonDropdownsubUnit=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[7]/div/div[2]/div/div/div[2]/i")); 
		  buttonDropdownsubUnit.click();
		  System.out.println("Sub Unit Drop down List is selected");
		  Thread.sleep(5000);
	  
	  }
	 
			  
			  
				
	
	  @Test(priority=11) 
	  
	  public void Checkbuttonsearch() throws InterruptedException{
		  WebElement buttonsearch=driver.findElement(By.xpath( "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[2]")); 
		  buttonsearch.click();
		  System.out.println("Employee Information search successfully.");
		  Thread.sleep(5000);
	  
	  }
	 
				  
	
	
	  @Test(priority=12) public void Checkbutton_reset() throws InterruptedException{ 
		  WebElement buttonreset=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[2]/button[1]")); 
		  buttonreset.click();
		  System.out.println("Rest button is working successfully.");
		  Thread.sleep(5000);
	  
	  
	  }
	 
			 

	
	  //Input new Employee Details
	  
	 @Test(priority=13)
	  
		
		
		  //check add button working properly or not 
	 public void addEmployee() throws InterruptedException { 
		 WebElement buttonadd=driver.findElement(By.xpath( "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
		  buttonadd.click();
		  System.out.println("Add button is working properly.");
		  Thread.sleep(5000);
		  
		  //add employee details missing some fields WebElement textboxfName=
		  WebElement textboxfName=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input" )); 
		  textboxfName.sendKeys("Ravindu");
		  System.out.println("First Name added successfully"); 
		  Thread.sleep(5000);
		  
		  WebElement textboxMName= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input")); 
		  textboxMName.sendKeys("Pathum");
		  System.out.println("Middle Name added successfuly"); 
		  Thread.sleep(5000);
		  
		  WebElement textboxlName= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input")); 
		  textboxlName.sendKeys(""); 
		  System.out.println("Last Name is required ");
		  Thread.sleep(5000);
		  
		  WebElement buttonsave=driver.findElement(By.xpath( "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
		  buttonsave.click(); 
		  System.out.println("New Employee Saved Successfully");
		  Thread.sleep(5000);
		  
		  }
		 
		 
	  
		
		  @Test(priority=14)
		  
		  //Add new Employee Details 
		  public void addEmployeeDetails() throws InterruptedException { 
			 WebElement buttonadd=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[1]/button"));
			 buttonadd.click(); System.out.println("Let's add a new user");
			 Thread.sleep(5000);
		 
	  
		
		  WebElement textboxfName= driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[1]/div[2]/input")); 
		  textboxfName.sendKeys("Ravindu");
		  System.out.println("First Name added successfully"); 
		  Thread.sleep(5000);
		  
		  WebElement textboxMName= driver.findElement(By.xpath( "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[2]/div[2]/input" )); textboxMName.sendKeys("Pathum");
		  System.out.println("Middle Name added successfuly"); 
		  Thread.sleep(5000);
		  
		  WebElement textboxlName= driver.findElement(By.xpath( "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div[2]/div[1]/div[1]/div/div/div[2]/div[3]/div[2]/input" )); 
		  textboxlName.sendKeys("Fernando");
		  System.out.println("Last Name added successfully "); 
		  Thread.sleep(5000);
		  
		  WebElement buttonsave=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[2]"));
		  buttonsave.click(); 
		  System.out.println("New Employee Saved Successfully");
		  Thread.sleep(5000);
		  
		  }
		 
	 

	
	  //check the cancel button working
	  
		
		  @Test(priority=15) 
		  
		  public void checkcancelbutton() throws InterruptedException { 
		  WebElement buttoncancel=driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[2]/button[1]"));
		  buttoncancel.click(); System.out.println("Cancel is successfull.");
		  Thread.sleep(5000);
		  
		  }
		 
	
		  
		  
		 
		//Check the Edit action is working
			
			  @Test(priority=16)
			  
			  public void editActionChecking() throws InterruptedException {
			  
			  WebElement ScrollUpButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]"));
			  ScrollUpButton.click(); System.out.println("Scrolled Up");
			  Thread.sleep(5000);
			  
			  WebElement EditButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[2]/div/div[9]/div/button[2]")); 
			  EditButton.click();
			  System.out.println("Edit Button Worked successfully.");
			  Thread.sleep(5000); }
			 
	
			  
			  
			  
			  
			  
	@Test(priority=17)
	
	 public void DeleteEmployee() throws InterruptedException{
		 WebElement ScrollUpButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[1]/div[2]/div[3]"));
	 	 ScrollUpButton.click();
		 System.out.println("Scrolled Up");
		 Thread.sleep(5000);
		 
		 WebElement CheckboxEmpID = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[3]/div/div[2]/div[1]/div/div[1]/div/div/label/span"));
		 CheckboxEmpID.click();
		 System.out.println("Checked the ID Box");
		 Thread.sleep(5000);
		 
		 WebElement DeleteButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/button"));
		 DeleteButton.click();
		 System.out.println("Clicked the Delete Button");
		 
	     Thread.sleep(5000);
		 
		 WebElement CancelButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[1]"));
		 CancelButton.click();
		 System.out.println("Reversed the Deletion with Cancel Button");
		 
		 Thread.sleep(5000);
		 
		 WebElement DeleteButton2 =driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/button"));
		 DeleteButton2.click();
		 System.out.println("Clicked the Delete Button");
		 
	     Thread.sleep(5000);
		 
		 
		 WebElement CloseButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/button"));
		 CloseButton.click();
		 System.out.println("Reversed the Deletion with Close Button in the Alert");
		 
	     Thread.sleep(5000);
	     
	     WebElement DeleteButton3 = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[2]/div[2]/div/div/button"));
		 DeleteButton3.click();
		 System.out.println("Clicked the Delete Button");
		 
	     Thread.sleep(5000);
		 
		 WebElement RealDltButton = driver.findElement(By.xpath("//*[@id=\"app\"]/div[3]/div/div/div/div[3]/button[2]"));
		 RealDltButton.click();
		 System.out.println("Completed the Deletion with YES Button");
		 
		 
		 
	 }
	  
	
}
