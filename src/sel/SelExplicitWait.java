package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelExplicitWait {

public static void main (String [] args){
		
		//to declare and instantiate objects and variables
		System.setProperty("webdriver.chrome.driver", "/Users/arunkumarselvam/Documents/eclipse-workspace/Projects/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//launch the HotelApp URL.
		driver.get("http://adactin.com/HotelApp/index.php");
				
		//applying explicit wait 
		WebElement userName = driver.findElement(By.id("username")); 
		WebDriverWait wait = new WebDriverWait(driver, 25);//creating wait object for driver instance with 25 seconds timeout under WebDriverWait class. 
		wait.until(ExpectedConditions.visibilityOf(userName));//using the wait object we can apply wait to any element of driver(browser) instance
		userName.sendKeys("arunkumarselvam");
		
		
	}

}