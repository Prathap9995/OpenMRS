package com.Prathap.OpenMRS.TestNG;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Prathap.OpenMRS.Objects.HomePage;
import com.Prathap.OpenMRS.Objects.OptionsPage;
import com.Prathap.OpenMRS.Resources.Base;

public class SearchPatient extends Base{
	
	@BeforeTest
	public void initiate() throws IOException {
		driver = InitWebDriver();
	}
	

@Test
public void GotoPage() {
	driver.get("https://demo.openmrs.org/openmrs/login.htm");
	HomePage hm = new HomePage(driver);
	hm.Username().sendKeys("Admin");
	hm.Password().sendKeys("Admin123");
	hm.IsolationWard().click();
	hm.Login().click();
	
	
}
		
		@Test
		public void OptionPage() {
			OptionsPage op = new OptionsPage(driver) ;
			op.PatientFind().click();
			
			}
		
	

@Test
public void PatientList() throws InterruptedException {
	
	driver.findElement(By.id("patient-search")).sendKeys("Adam");
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	List<WebElement> list = driver.findElements(By.xpath("//tbody/tr/td"));
	for(int i=0; i<list.size();i++) {
	String name=	list.get(i).getText();
	System.out.println(name);
	
	if(name.contains("Donna")) {
		list.get(i).click();
	}
	
	}


}
	
}
