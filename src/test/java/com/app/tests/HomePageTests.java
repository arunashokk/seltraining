package com.app.tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import com.app.pages.BasePage;
import com.app.pages.HomePageObjects;

public class HomePageTests {
	
	HomePageObjects homePage;
	BasePage bp; 

	public HomePageTests() {
		homePage = new HomePageObjects();
		bp = new BasePage();
	}
	
	@Test
	public void verifyLogo(){
		Assert.assertTrue(homePage.getLogo().isDisplayed());
	}
	
	@Test
	public void verifyNavTitles(){
		homePage.getWomen();
		System.out.println(homePage.getWomen().getText());
		Assert.assertTrue(homePage.getWomen().getText().equals("WOMEN"), "Failed: Women page is not displayed");
		homePage.getDresses();
		System.out.println(homePage.getDresses().getText());
		Assert.assertTrue(homePage.getDresses().getText().equals("DRESSES"), "Failed: DRESSES page is not displayed");
		homePage.getTShirts();
		System.out.println(homePage.getTShirts().getText());
		Assert.assertTrue(homePage.getTShirts().getText().equals("T-SHIRTS"), "Failed: T-Shirts page is not displayed");
	}
	
	@Test
	public void verifyMenuNavigation(){
		homePage.clickWomen();
		System.out.println(homePage.getHeader().getText());
		Assert.assertTrue(homePage.getHeader().getText().trim().equalsIgnoreCase("WOMEN"), "Failed: Women page is not displayed");
		homePage.clickDresses();
		System.out.println(homePage.getHeader().getText());
		Assert.assertTrue(homePage.getHeader().getText().trim().equalsIgnoreCase("DRESSES"), "Failed: Dresses page is not displayed");
		homePage.clickTShirts();
		System.out.println(homePage.getHeader().getText());
		Assert.assertTrue(homePage.getHeader().getText().trim().equalsIgnoreCase("T-Shirts"), "Failed: T-shirts page is not displayed");
		}

	@Test
	public void verifyNewsletterInputAlert(){
		Assert.assertTrue(homePage.getalert().getText().equalsIgnoreCase("Newsletter : You have successfully subscribed to this newsletter."), "Failed: Email already exists");
	}
	
	
	
}
