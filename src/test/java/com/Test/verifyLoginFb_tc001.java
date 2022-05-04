package com.Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import com.PageObject.LoginPom;
import com.Utility.BaseClass;
import com.Utility.Library;

public class verifyLoginFb_tc001 extends BaseClass{
	
	@Test
	public void verifyfblogin() {
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
			
		Library.custom_sendKeys(login.getEmailid(), excel.getStringData("Sheet1", 0, 0));
		Library.custom_sendKeys(login.getPassword(),excel.getStringData("Sheet1", 0, 1));
		Library.custom_click(login.getLoginBtn());
				
	}
	
}
