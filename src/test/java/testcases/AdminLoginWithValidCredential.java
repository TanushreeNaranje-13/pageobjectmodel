package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.LoginPage;
import utility.AppUtil;

public class AdminLoginWithValidCredential extends AppUtil {

	@Test
	public void AdminLogin() {
		LoginPage lp =PageFactory.initElements(driver,LoginPage.class);
		lp.loginPage("Admin","Qedge123!@#");
		
		}
	}

