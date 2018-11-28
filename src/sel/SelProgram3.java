package sel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelProgram3 {

public static void main (String [] args) {
	
	//to declare and instantiate objects and variables
	System.setProperty("webdriver.chrome.driver", "/Users/arunkumarselvam/Documents/eclipse-workspace/Projects/chromedriver");
	WebDriver driver = new ChromeDriver();
	
	//to launch the given URL. 
	driver.get("https://opensource-demo.orangehrmlive.com/");
	
	//to find Username edit box and enter the username
	driver.findElement(By.id("txtUsername")).sendKeys("admin");
	
	//to find the password edit box and enter the password. 
	driver.findElement(By.id("txtPassword")).sendKeys("admin123");
	
	//to find the Login button and click on it 
	driver.findElement(By.id("btnLogin")).click();
	
	//to find the logged in user name at the right side of page
	String msg = driver.findElement(By.id("welcome")).getText();
	System.out.println(msg);
	
	if(msg.equals("Welcome Admin")){
		System.out.println("Login success");
	}
	else{
		System.out.println("Login failed");
	}
	
	driver.quit();
	
}

}
