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
       System.out.println(str);
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
        hm.Screenshot("Isolation", driver);
    }
    
    @Given("^Login using \"([^\"]*)\" and \"([^\"]*)\" $")
    public void login_using_something_and_something(String strArg1, String strArg2) throws Throwable {
        HomePage h = new HomePage(driver);
        h.Username().sendKeys(strArg1);
        h.Password().sendKeys(strArg2);
        h.IsolationWard().click();
        h.Login().click();
    }

    
    @When("^Click on find a patient $")
    public void click_on_find_a_patient() throws Throwable {
        throw new PendingException();
    }

    @Then("^Get the contact information and take a screenshot$")
    public void get_the_contact_information_and_take_a_screenshot() throws Throwable {
        throw new PendingException();
    }

    @And("^Search using Keyword \"([^\"]*)\"$")
    public void search_using_keyword_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^select a Patient with name \"([^\"]*)\"$")
    public void select_a_patient_with_name_something(String strArg1) throws Throwable {
        throw new PendingException();
    }

    @And("^Click on logout and close the browser$")
    public void click_on_logout_and_close_the_browser() throws Throwable {
        throw new PendingException();
    }


    
    
    
    
    @After
    public void CloseAll() {
    	driver.quit();
    	
    }

}


