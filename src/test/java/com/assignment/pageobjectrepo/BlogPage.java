package com.assignment.pageobjectrepo;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.assignment.common.Initialization;

public class BlogPage extends Initialization 
{

	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));
	
	@FindBy(xpath="//a[text()='Blog']")
	private WebElement blogOption;
	
	public void verifyCurrentURL(String url)
	{
		String expectedURL=url;
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Customer Service - Client Service']")));
		String acturalUrl=driver.getCurrentUrl();
		
		Assert.assertEquals(acturalUrl, expectedURL);
		
		System.out.println("Expected URL verified  ");
	}
}
