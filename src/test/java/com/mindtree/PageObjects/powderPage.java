package com.mindtree.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIstore.powderpageUI;

public class powderPage {
	public WebDriver driver;
	
	public powderPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement checktitle() {
		return driver.findElement(powderpageUI.checkEle);
		
	}

}
