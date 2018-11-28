package com.app.tests;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.BasePage;
import com.app.pages.CartPageObjects;
import com.app.pages.DressesPageObjects;
import com.app.pages.HomePageObjects;

public class DressesPageTests {

	DressesPageObjects dressPage;
	HomePageObjects homePage;
	CartPageObjects cartPage;
	
	//constructor
	public DressesPageTests() {
		homePage = new HomePageObjects();
		dressPage = new DressesPageObjects();
	}
	
	/*@Test
	public void compareProductCount(){
		homePage.clickDresses();
		Assert.assertTrue(dressPage.getHeaderTxtCount()==dressPage.getProductCount(), "Failed: Count doesn't match");
	}*/
	
	/*@Test
	public void verifySortDD(){
		homePage.clickDresses();
		Assert.assertTrue(dressPage.getSortDD().isDisplayed());
	}
	
	@Test
	public void verifySort(){
		homePage.clickDresses();
		dressPage.selectSort();
		}*/
	
	@Test
	public void verifySizeOptions(){
		homePage.clickDresses();
		System.out.println(dressPage.getSize());
		List<String> actualValue = dressPage.getSize();
		ArrayList<String> expectedValues = new ArrayList<String>();
		expectedValues.addAll(Arrays.asList("S", "M", "L"));
		Assert.assertTrue(actualValue.containsAll(expectedValues));
	}
	
	/*@Test
	public void verifyAddToCartFunc(){
		homePage.clickDresses();
		dressPage.clickAddToCart();
		Assert.assertTrue(cartPage.getElement().getText(), "Failed: Text not found");
	}*/

}