package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action_FaceBOOK {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		Actions act = new Actions(driver);
		WebElement user =driver.findElement(By.xpath("//*[@id=\"email\"]"));
		act.sendKeys(user,"daskrishna@yahoo.com");
		act.perform();
		
		WebElement pass =driver.findElement(By.xpath("//*[@id=\"pass\"]"));
		act.sendKeys(pass,"das2345");
		act.perform();
 
		act.contextClick(user);// right click
		act.perform();
		
		act.sendKeys(Keys.COMMAND+"a"); // Highlight 
	
		act.perform();  //
		
	}

}
