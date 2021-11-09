package com.mindtree.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIstore.searchnextPageUI;



public class searchnextPage {
	public WebDriver driver;
	public searchnextPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}
	public WebElement checkItemtitle() {
		return driver.findElement(searchnextPageUI.itemElem);
		
	}

}
