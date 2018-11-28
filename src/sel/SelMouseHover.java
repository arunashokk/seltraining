package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SelMouseHover {

public static void main (String [] args){
		
		//to declare and instantiate objects and variables
		System.setProperty("webdriver.chrome.driver", "/Users/arunkumarselvam/Documents/eclipse-workspace/Projects/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//launch the HotelApp URL.
		driver.get("https://www.amazon.in/");
		
		//to perform mouse hover
		Actions ac = new Actions(driver); //for mouse hover we need to use Actions class. 
		ac.moveToElement(driver.findElement(By.id("nav-link-shopall"))).build().perform();
		ac.contextClick().build().perform();
		
		//ac.doubleClick().build().perform();
		
		driver.quit();
}

}
