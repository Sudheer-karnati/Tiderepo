package com.mindtree.Runner;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mindtree.PageObjects.LandingPage;
import com.mindtree.PageObjects.powderPage;
import com.mindtree.Reusuable.WebDriverHelper;

public class TideRunner extends WebDriverHelper {
	public static WebDriver driver;
	// private static Logger log=(Logger)
	// LogManager.getLogger(HomePg.class.getName());

	@BeforeMethod
	public void intialize() throws IOException {
		driver = initializedriver();
		driver.manage().window().maximize();
	}

	@Test
	public void Testcase1() {
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		WebElement ele;
		ele = l.Shopbtn();
		
		Actions action = new Actions(driver);

		
		action.moveToElement(ele);
		WebElement sub;
		sub = l.powderbtn();
		// To mouseover on sub
		Actions actions = new Actions(driver);
		actions.moveToElement(sub);

		
		actions.click().build().perform();
		
		powderPage p=new powderPage(driver);
		String s=p.checktitle().getText();
		Assert.assertEquals(s,"Free and Gentle Powder Laundry Detergent" );
		//if(s.equalsIgnoreCase("Free and Gentle Powder Laundry Detergent"))
	}
	@Test
	public void TestCase2() {
		driver.get(prop.getProperty("url"));
		LandingPage l = new LandingPage(driver);
		WebElement ele;
		ele = l.howTowashClothbtn();
		
		Actions action = new Actions(driver);

		// Performing the mouse hover action on the target element.
		action.moveToElement(ele);
		
		WebElement subb;
		subb = l.howToDoLand();
		
		Actions actions = new Actions(driver);
		actions.moveToElement(subb);

		
		actions.click().build().perform();
		
		String titleitem=l.howToReadLand().getText();
		if(titleitem.contains("“How to Read Laundry Symbols")) {
			System.out.println("Verified");
		}
		else
			System.out.println("not verified");
		
	}
	

	@AfterMethod
	public void closebrowser() {
		driver.close();
	}

}
