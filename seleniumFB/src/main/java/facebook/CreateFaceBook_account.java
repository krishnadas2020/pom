package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateFaceBook_account {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/Krishnadas/downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.facebook.com/");
		
		WebElement e= driver.findElement(By.xpath("//a[text()='Create new account']"));
		e.click();
		
		
		
		
		

	}

}
