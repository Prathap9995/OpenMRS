package com.Prathap.OpenMRS.Objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Prathap.OpenMRS.Resources.Base;

public class OptionsPage extends Base{
	
	
	public OptionsPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "coreapps-activeVisitsHomepageLink-coreapps-activeVisitsHomepageLink-extension")
	WebElement Patient;
	
	public WebElement PatientFind() {
		return Patient;
	}
	
	@FindBy(id="patient-search")
		WebElement search;
	
	public WebElement SearchPatient() {
		return search;
		
	}
}
