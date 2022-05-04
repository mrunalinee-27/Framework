package com.Utility;

import org.openqa.selenium.WebElement;

public class Library {

	public static void custom_sendKeys(WebElement element,String value) {
		
		if(element.isDisplayed() && element.isEnabled()) {
			element.sendKeys(value);
		}else {
			System.out.println("uanble to send values");
		}
	}
	
	public static void custom_click(WebElement element) {
		if(element.isEnabled()) {
			element.click();
		}else {
			System.out.println("unable to click");
		}
	}
}
