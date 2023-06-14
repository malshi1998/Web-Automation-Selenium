package TestNGPractical;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Demostraion {
	
public String baseUrl="http://www.phptravels.org/register.php"; 
	
	String driverPath= "C:\\Users\\INSIGHT\\eclipse-workspace\\TestNGProject1\\ThirdPartyResources\\ChromeDriver\\chromedriver.exe";
	public WebDriver driver;
  
  @BeforeTest
public void callBrowser() {
	  
	  System.setProperty("webdriver.chrome.driver", driverPath);
	  driver = new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get(baseUrl);
  }
  
  
  @Test(priority=1)
  public void personalInformation() throws InterruptedException {

	  WebElement textBox1=driver.findElement(By.xpath("/html/body/section/div/div[1]/div[2]/div/form/div[1]/div[1]/div/div/div[1]/div/input"));
		textBox1.sendKeys("2 ");
		
		WebElement textBox2=driver.findElement(By.xpath("/html/body/section/div/div[1]/div[2]/div/form/div[1]/div[1]/div/div/div[2]/div/input"));
		textBox2.sendKeys("5 ");
		WebElement textBox3=driver.findElement(By.xpath("/html/body/section/div/div[1]/div[2]/div/form/div[1]/div[1]/div/div/div[3]/div/input"));
		textBox3.sendKeys("((textbox1-1)*25)+((textbox2-3)*4)) ");
		
		
		
		Thread.sleep(3000);
}
  
/*
 * @Test(priority=2) public void billingAddress() throws InterruptedException {
 * 
 * 
 * WebElement textboxaddress=driver.findElement(By.xpath(
 * "/html/body/section/div/div[1]/div[2]/div/form/div[1]/div[2]/div/div/div[2]/div/input"
 * )); textboxaddress.sendKeys("Colombo");
 * 
 * WebElement textboxstreet=driver.findElement(By.xpath(
 * "/html/body/section/div/div[1]/div[2]/div/form/div[1]/div[2]/div/div/div[3]/div/input"
 * )); textboxstreet.sendKeys("Wathupole");
 * 
 * WebElement textboxcity=driver.findElement(By.xpath(
 * "/html/body/section/div/div[1]/div[2]/div/form/div[1]/div[2]/div/div/div[4]/div/input"
 * )); textboxcity.sendKeys("pallama");
 * 
 * WebElement textboxstate=driver.findElement(By.xpath(
 * "/html/body/section/div/div[1]/div[2]/div/form/div[1]/div[2]/div/div/div[5]/div/input"
 * )); textboxstate.sendKeys("Lanka");
 * 
 * WebElement textboxpost=driver.findElement(By.xpath(
 * "/html/body/section/div/div[1]/div[2]/div/form/div[1]/div[2]/div/div/div[6]/div/input"
 * )); textboxpost.sendKeys("61000");
 * 
 * WebElement textboxcountry=driver.findElement(By.xpath(
 * "/html/body/section/div/div[1]/div[2]/div/form/div[1]/div[2]/div/div/div[7]/div/select"
 * )); textboxcountry.sendKeys("Wath");
 * 
 * Thread.sleep(5000);
 * 
 * 
 * }
 * 
 * @Test(priority=3) public void additionalInformation() throws
 * InterruptedException {
 * 
 * WebElement
 * textboxmobile=driver.findElement(By.xpath("//*[@id=\"customfield2\"]"));
 * textboxmobile.sendKeys("7648581456"); Thread.sleep(3000);
 * 
 * }
 * 
 * @Test(priority=4) public void accountSecurity() throws InterruptedException {
 * WebElement
 * textboxpass=driver.findElement(By.xpath("//*[@id=\"inputNewPassword1\"]"));
 * textboxpass.sendKeys("gj5632");
 * 
 * WebElement
 * textboxconpass=driver.findElement(By.xpath("//*[@id=\"inputNewPassword2\"]"))
 * ; textboxconpass.sendKeys("gj5632");
 * 
 * WebElement button=driver.findElement(By.xpath(
 * "//*[@id=\"containerPassword\"]/div[4]/div/button")); button.click();
 * Thread.sleep(3000);
 * 
 * }
 * 
 * @Test(priority=5) public void mailing() throws InterruptedException {
 * WebElement buttonmail=driver.findElement(By.xpath(
 * "//*[@id=\"frmCheckout\"]/div[3]/div/div/div/span[2]")); buttonmail.click();
 * Thread.sleep(3000); }
 * 
 * @Test(priority=6) public void capthcha() throws InterruptedException {
 * WebElement
 * buttoncap=driver.findElement(By.xpath("//*[@id=\"recaptcha-anchor\"]/div[1]")
 * ); buttoncap.click(); Thread.sleep(3000);
 * 
 * 
 * }
 * 
 * @Test(priority=7) public void register() throws InterruptedException {
 * WebElement
 * buttonreg=driver.findElement(By.xpath("//*[@id=\"frmCheckout\"]/p/input"));
 * buttonreg.click(); Thread.sleep(3000); }
 */
  
}
