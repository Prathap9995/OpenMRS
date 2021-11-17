package com.Prathap.OpenMRS.TestNG;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.Prathap.OpenMRS.Objects.HomePage;
import com.Prathap.OpenMRS.Objects.OptionsPage;
import com.Prathap.OpenMRS.Resources.Base;

public class WebTable extends Base {
	
	@BeforeTest
	public void init() throws IOException {
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
	public void table() {
		List<WebElement> list = driver.findElements(By.xpath("//tbody/tr/child::td[2]"));
		for(int i=0; i<list.size();i++) {
		String name=	list.get(i).getText();
		System.out.println(name);
		
		if(name.contains("Prakash")) {
		//	driver.findElement(By.xpath("//tbody/tr/child::td[2]")).click();
			list.get(i).click();
		}
//		ArrayList al =new ArrayList(Arrays.asList(name));
//		System.out.println(al);
//		for(int j=0; j<=al.size();j++);
//		System.out.println(al.get(i));
		}
	}
	
//	@AfterTest
//	public void close() {
//		driver.close();
//	}

}
