package page;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {

	//create object repository
	
	@FindBy(id="txtUsername")
	WebElement username;
	
	@FindBy(id="txtPassword")
	WebElement password;
	
	@FindBy(xpath="//input[@type='submit']")
	WebElement submit;
	
	public void loginPage(String uname, String pwd) {
		username.sendKeys(uname);
		password.sendKeys(pwd);
		submit.click();
		
	// demo
		System.out.println("hellow world");
		System.out.println("my life");
		
		System.out.println("my life my rule");
	}
	
	
}
