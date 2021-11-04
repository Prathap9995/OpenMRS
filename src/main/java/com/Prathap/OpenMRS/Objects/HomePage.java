package com.Prathap.OpenMRS.Objects;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Prathap.OpenMRS.Resources.Base;

public class HomePage extends Base {
	
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	WebElement username;
	
	public WebElement Username() {
		return username;
	}

	@FindBy(id="password")
	WebElement password;
	
	public WebElement Password() {
		return password;
	}
	
	@FindBy(id = "Isolation Ward")
	WebElement ward;
	
	public WebElement IsolationWard() {
		return ward;
	}
	
	@FindBy(id="loginButton")
	WebElement login;
	
	public WebElement Login() {
		return login;
	}
	
	@FindBy(id = "error-message")
	WebElement error;
	
	public WebElement Error() {
		return error;
	}
}
