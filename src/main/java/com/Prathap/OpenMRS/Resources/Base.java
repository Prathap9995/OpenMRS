package com.Prathap.OpenMRS.Resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base {
	public WebDriver driver;
	
	
	public WebDriver InitWebDriver() throws IOException {
		Properties pro = new Properties();
		FileInputStream file = new FileInputStream("src/main/java/com/Prathap/OpenMRS/Resources/Data.properties");
		pro.load(file);
	String browsername = pro.getProperty("browser");
	System.out.println(browsername);
	
	if(browsername.equals("chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\prathapk\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	else {
		System.out.println("Check browser name in property file");
	}
	
	driver.manage().timeouts().implicitlyWait(1000, TimeUnit.MILLISECONDS);
	return driver;
	}
	
	public void Screenshot(String TestCasename, WebDriver driver) throws IOException {
	File ScreenShot = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	FileUtils.copyFile(ScreenShot, new File("target/"+TestCasename+".png"));
	}

}
