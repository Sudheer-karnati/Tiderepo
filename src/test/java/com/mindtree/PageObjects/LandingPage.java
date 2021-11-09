package com.mindtree.PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.UIstore.LandingPageUI;

public class LandingPage {
	public WebDriver driver;
	
	

	
	public LandingPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public WebElement Shopbtn() {
		return driver.findElement(LandingPageUI.shopproductEle);
		
	}
	public WebElement powderbtn() {
		return driver.findElement(LandingPageUI.powderEle);
		
	}
	public WebElement searchbtn() {
		return driver.findElement(LandingPageUI.searchBoxEle);
		
	}
	public WebElement searchiconbtn() {
		return driver.findElement(LandingPageUI.searchiconEle);
		
	}
	public WebElement howTowashClothbtn() {
		return driver.findElement(LandingPageUI.howToWashClothEle);
		
	}
	public WebElement howToDoLand() {
		return driver.findElement(LandingPageUI.howToDoLaundaryEle);
		
	}
	public WebElement howToReadLand() {
		return driver.findElement(LandingPageUI.howToReadLaundaryEle);
		
	}


}
