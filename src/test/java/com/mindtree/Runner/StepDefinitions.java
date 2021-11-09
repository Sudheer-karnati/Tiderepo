package com.mindtree.Runner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.mindtree.PageObjects.LandingPage;
import com.mindtree.PageObjects.searchnextPage;
import com.mindtree.Reusuable.WebDriverHelper;

import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class StepDefinitions extends WebDriverHelper {
	public WebDriver driver;
	@Given("^user is on browser$")
	public void user_is_on_browser() throws Throwable {
		WebDriverHelper w=new WebDriverHelper();
		driver=w.initializedriver();
		throw new PendingException();
	}

	@And("^user on Home page$")
	public void user_on_home_page() throws Throwable {
		driver.get("https://tide.com/en-us");
		throw new PendingException();
	}

	@When("^user search \"([^\"]*)\"$")
	public void user_search_something(String strArg1) throws Throwable {
		LandingPage l = new LandingPage(driver);
		l.searchbtn().sendKeys(strArg1);
		l.searchiconbtn().click();
		
		
			
		
		
		throw new PendingException();
	}

	@Then("^user validate the text$")
	public void user_validate_the_text() throws Throwable {
		
		searchnextPage sp=new searchnextPage(driver);
		String itemname=sp.checkItemtitle().getText();
		if(itemname.contains("Antibacterial")) {
			System.out.println("resultant products have Antibacterial");
		}
		
		throw new PendingException();
	}

}
