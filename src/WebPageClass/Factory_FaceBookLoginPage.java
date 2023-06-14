package WebPageClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.annotations.Test;

public class Factory_FaceBookLoginPage {
	
	//Identify web element
	
	// 1) Normal way of find element
	@FindBy(xpath="//*[@id=\"email\"]") WebElement userlogin;
  
	//2) Standard way of find element using How
	
	@FindBy(how=How.XPATH,using="//*[@id=\"pass\"]") WebElement password;
	
	@FindBy(how=How.NAME,using="login") WebElement logginButton;
	
	//3)Define web driver object for page class
	
	WebDriver WebPageClassDriver;
	
	//4)Constructor method
	
	public Factory_FaceBookLoginPage(WebDriver TestClassDriver) {
			this.WebPageClassDriver=TestClassDriver;
		
	}
	
	//5)Initialize method
	public void Validatelogin(String uname, String pass) {
			userlogin.sendKeys(uname);
			password.sendKeys(pass);
			logginButton.click();
		
	}
	
	public void InsertValuetoUserName(String uname) {
			userlogin.sendKeys(uname);
	}
	
	
	

}

