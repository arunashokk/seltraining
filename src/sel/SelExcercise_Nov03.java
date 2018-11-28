package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelExcercise_Nov03 {
	
	public static void main (String [] args){
		
		//to declare and instantiate objects and variables
		System.setProperty("webdriver.chrome.driver", "/Users/arunkumarselvam/Documents/eclipse-workspace/Projects/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		//launch the HotelApp URL.
		driver.get("http://adactin.com/HotelApp/index.php");
		
		//find Username text box and enter valid username.
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("arunkumarselvam");
		
		//find Password text box and enter valid password. 
		driver.findElement(By.id("password")).sendKeys("Arun1986");
		
		//find Login button and click on it.
		driver.findElement(By.id("login")).click();
		
		//will get the current url from the launched browser 
		String url = driver.getCurrentUrl();
		System.out.println("URL is ==> " + url);
		
		//to get the username after logging in
		WebElement name = driver.findElement(By.id("username_show"));
		String username = name.getAttribute("value");
		System.out.println("Name is ==> " + username);
		
		if (username.equals("Hello arunkumarselvam!")){
			System.out.println("User logged in");
		}
		else{
			System.out.println("Login failed");
		}
		
		driver.quit();
		
	}
}
