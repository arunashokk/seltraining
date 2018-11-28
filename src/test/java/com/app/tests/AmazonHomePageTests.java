package com.app.tests;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.AmazonBasePage;
import com.app.pages.AmazonHomePageObjects;


public class AmazonHomePageTests {

	AmazonHomePageObjects ahp;
	AmazonBasePage abp; 

	public AmazonHomePageTests() {
		ahp = new AmazonHomePageObjects();
		abp = new AmazonBasePage();
	}
	
	@Test //to verify each product in Today's Deals carousel has price and print products missing price with product position
	
	public void verifyProductPriceinDealnProducts(){
		List<WebElement> dealProducts = ahp.getProductsInTodaysDeals();
		for(WebElement product : dealProducts){
			Assert.assertTrue(ahp.verifyProductPrice(product), "Failed: Product price not displayed for Product ==> " + ahp.getProductIndex(product));
		}
	}
	
	@Test //to verify each product in Today's Deals carousel has price and print products missing price with product name
	
	public void verifyProductPriceinDealNProducts(){
		List<WebElement> dealProducts = ahp.getProductsInTodaysDeals();
		for(WebElement product : dealProducts){
			Assert.assertTrue(ahp.verifyProductPrice(product), "Failed: Product price not displayed for Product ==> " + ahp.getProductName(product));
		}
	}
	
	
}
