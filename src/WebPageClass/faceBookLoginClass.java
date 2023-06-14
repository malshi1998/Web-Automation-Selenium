package WebPageClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class faceBookLoginClass {
	
	//1)Identify the web elements. By class Provides a mechanism by which to find elements within a document
	
	By username=By.xpath("//*[@id=\\\"email\\\"]");
	By password=By.xpath("//*[@id=\\\"pass\\\"]");
	   
	
	
	By loginButton=By.name("login");
	
	//2) Define the web driver
	
		WebDriver PageClassWebDriver;
		
	//3) create a constructor which is same as class name 
		public faceBookLoginClass(WebDriver TestClassParameterDriver) 
		{
			this.PageClassWebDriver=TestClassParameterDriver;
			
		}
	//4) Initialize methods
		public void typeUserNameUsingParameters(String userName) {
		
		//5) findElement operation and set values using parameters
			PageClassWebDriver.findElement(username).sendKeys(userName);
		}
		
		public void clickLoginButton() 
		{
			PageClassWebDriver.findElement(loginButton).click();
		}
		public void passingValuestoUsernamePassword(String Txtusername, String Txtpassword) {
			PageClassWebDriver.findElement(username).sendKeys(Txtusername);
			PageClassWebDriver.findElement(password).sendKeys(Txtpassword);
			
		}
		
		public void passingValuestoUserNamePasswordAndClickLoginButton(String TxtuserName, String Txtpassword) {

			PageClassWebDriver.findElement(username).sendKeys(TxtuserName);
			PageClassWebDriver.findElement(password).sendKeys(Txtpassword);
			PageClassWebDriver.findElement(loginButton).click();
		}
}
