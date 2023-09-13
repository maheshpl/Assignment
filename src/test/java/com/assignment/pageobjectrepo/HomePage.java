package com.assignment.pageobjectrepo;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.assignment.common.Initialization;

public class HomePage extends Initialization
{
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(60));

	JavascriptExecutor js=(JavascriptExecutor) driver;
	
	
	@FindBy(xpath="//a[text()='Blog']")
	private WebElement blogOption;
	
	public void launch(String url)
	{
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	public void scrollToBlogOption()
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Tricentis Demo Web Shop']")));
		js.executeScript("window.scrollBy(0,1000)");
	}
	
	public void clickOnBlogOption()
	{
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[text()='Blog']")));
		blogOption.click();
	}
}