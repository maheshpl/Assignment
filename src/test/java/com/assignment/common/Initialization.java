package com.assignment.common;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.assignment.pageobjectrepo.BlogPage;
import com.assignment.pageobjectrepo.HomePage;

public class Initialization 
{
	public static WebDriver driver=new ChromeDriver();
	public static HomePage homePage;
	public static BlogPage blogPage;
	
	@BeforeClass
	public void configBeforeClass()
	{
		homePage=PageFactory.initElements(driver,HomePage.class);
		blogPage=PageFactory.initElements(driver,BlogPage.class);
	}
	
	public static void getScreenshot(String FileName)
	{
		try
		{
			TakesScreenshot obj=(TakesScreenshot)driver;
			File sourceFile=obj.getScreenshotAs(OutputType.FILE);
			File destinationFile=new File("./Screensots/"+FileName);
			FileUtils.copyFile(sourceFile, destinationFile);
		}catch(Exception e)
		{
			e.printStackTrace();		
		}
		System.out.println("Screenshot saved successfully");
	}
	
	@AfterClass
	public void closeBrowser() {
		driver.quit();
	}
	
}