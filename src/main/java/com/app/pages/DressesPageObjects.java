package com.app.pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DressesPageObjects extends BasePage{

		@FindBy(xpath = "//*[@class = 'heading-counter']")
		private WebElement headerTxt;
		
		@FindBys(@FindBy (xpath = "//*[@class = 'product_list grid row']/li"))
		private List<WebElement> lstProducts;
		
		@FindBys(@FindBy(xpath = "//*[@id = 'ul_layered_id_attribute_group_1']/li"))
		private List<WebElement> lstSize;
		
		@FindBy(xpath = "//*[@id = 'selectProductSort']")
		private WebElement sortProduct;
		
		/*@FindBy(xpath = "");
		private WebElement addToCart;*/
		
		public DressesPageObjects(){
			PageFactory.initElements(driver, this);
		}
		
		public int getHeaderTxtCount(){
			String headerText = headerTxt.getText();
			String[] arr = headerText.split(" ");
			String countText = arr[2];
			int count = Integer.parseInt(countText);
			System.out.println(count);
			return count;
		}
		
		public int getProductCount(){
			int productCount = lstProducts.size();
			System.out.println(productCount);
			return productCount;
		}
		
		public List<String> getSize(){
			ArrayList<String> sizeList = new ArrayList<String>();
			for(WebElement element : lstSize){
				sizeList.add(element.getText().split(" ")[0].trim());
			}
			return sizeList;
		}
		
		/*public WebElement getSortDD(){
			return sortProduct;
		}

		public void selectSort(){
			Select dropdown = new Select(sortProduct);
			dropdown.selectByVisibleText("Price: Lowest first");
			String selectedValue = dropdown.getFirstSelectedOption().getText();
			System.out.println(selectedValue); //prints the current selected value 
		}
		
		public void clickAddToCart(){
			addToCart.click();
		}*/
}
