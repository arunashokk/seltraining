package com.app.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

public class AmazonTodaysDealsObjects extends AmazonBasePage {
	
	@FindBy(xpath = "//*[@name = 'sortOptions']")
	public WebElement dropDownSort;
	
	@FindBy(xpath = "//div[contains(@id, 'widgetFilters')]//div[4]/span[2]")
	private WebElement chkBoxPrice500;
	
	@FindBys(@FindBy(xpath = "//*[contains(@class, 'rightCol')]//div[contains(@class,'priceBlock')]//span"))
	List<WebElement> lstProductPrice;

	public AmazonTodaysDealsObjects(){
		PageFactory.initElements(driver, this);
	}
	
	public void clickChkBoxPrice500(){
		chkBoxPrice500.click();
	}
	
	public void selectSortDropDown(String input){
		selectFromDropDown(dropDownSort, input);
	}
	
	public ArrayList<Double> getDealProductPrices(){
		ArrayList<Double> prices = new ArrayList<Double>();
		for(WebElement product : lstProductPrice){
		String text = product.getText().replace("₹", "").replace(",", "").split("-")[0].trim();
		Double value = Double.parseDouble(text);
		prices.add(value);
		System.out.println(value);
		}
		return prices;
	}
	
}
