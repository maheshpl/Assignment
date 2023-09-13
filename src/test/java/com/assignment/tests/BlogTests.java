package com.assignment.tests;

import org.testng.annotations.Test;

import com.assignment.common.Initialization;

public class BlogTests extends Initialization
{
	
	@Test(priority=1)
	public static void verifyBlogPageURL()
	{
		homePage.launch("https://demowebshop.tricentis.com");
		homePage.scrollToBlogOption();
		homePage.clickOnBlogOption();
		blogPage.verifyCurrentURL("https://demowebshop.tricentis.com/blog");
		getScreenshot("file1.png");
	}
}