package com.app.tests;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import java.util.ArrayList;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.app.pages.AmazonBasePage;
import com.app.pages.AmazonHomePageObjects;
import com.app.pages.AmazonTodaysDealsObjects;

public class AmazonTodaysDealsTestPage {

	AmazonTodaysDealsObjects atdp;
	AmazonBasePage abp;
	AmazonHomePageObjects ahp;

	//Constructor
	public AmazonTodaysDealsTestPage() {
		ahp = new AmazonHomePageObjects();
		atdp = new AmazonTodaysDealsObjects();
		abp = new AmazonBasePage();
	}
	
	@Test //to sort given products in ascending oder by Price and verify page is sorted
	public void verifyProductPriceAscendingOrder(){
		ahp.clickTodaysDealsNav();
		atdp.selectSortDropDown("BY_PRICE_ASCENDING");
		ArrayList<Double> prices = atdp.getDealProductPrices();
		for(int i = 0; i < prices.size() - 1; i++){
			AssertJUnit.assertTrue(prices.get(i) <= prices.get(i+1));
		}
	}
	
	@Test//to select checkbox Price 500-1000 from Today's Deals page and verify products filtered are within the given price range. 
	public void verifyProductPricesinGivenRange(){
		ahp.clickTodaysDealsNav();
		atdp.clickChkBoxPrice500();
		abp.isElementVisible(atdp.dropDownSort);//applying wait to make sure products load before getting the list 
		ArrayList<Double> prices = atdp.getDealProductPrices();
		System.out.println(prices);
		for(int i=0; i<prices.size() - 1; i++){
			AssertJUnit.assertTrue((prices.get(i) >= 500) && (prices.get(i) <= 1000));
		}
	}
}
