package com.Prathap.OpenMRS.StepDefinition;

import java.io.IOException;

import org.junit.runner.RunWith;

import com.Prathap.OpenMRS.Objects.HomePage;
import com.Prathap.OpenMRS.Resources.Base;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.PendingException;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

@RunWith(Cucumber.class)
public class StepDefinition01 extends Base {
	
	public HomePage home;
	
	@Before
	public void Initialize() throws IOException {
		driver = InitWebDriver();
	}
	
	@Given("^Navigate to \"([^\"]*)\"$")
    public void navigate_to_something(String strArg1) throws Throwable {
        driver.get(strArg1);
  Thread.sleep(1000);
        
    }

	@Given("^Try to Login using (.+) and (.+)$")
    public void try_to_login_using_and(String email, String password) throws Throwable {
        HomePage home = new HomePage(driver);
        home.Username().sendKeys(email);
        home.Password().sendKeys(password);
        Thread.sleep(5000);
    }

    

        
        
    

    @When("^Click on Login button$")
    public void click_on_login_button() throws Throwable {
    	HomePage hl = new HomePage(driver);
    	hl.Login().click();
        
    }

    @Then("^If it a valid then get PageTitle else error message$")
    public void if_it_a_valid_then_get_pagetitle_else_error_message() throws Throwable {
       String str = driver.getCurrentUrl();
    	if(str.equals(str)) {
    	String Title = driver.getTitle();
    	System.out.println(Title);
    	}
    	
    	else {
    		System.out.println(driver.getCurrentUrl());
    	}
    }

    @And("^Select the proper Location$")
    public void select_the_proper_location() throws Throwable {
        HomePage hm = new HomePage(driver);
        hm.IsolationWard().click();
    }
    
    @After
    public void CloseAll() {
    	driver.quit();
    	
    }

}


