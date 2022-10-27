package google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeOnGoogleSearch {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "/Users/Krishnadas/downloads/chromedriver");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		//Thread.sleep(5000);
		
		WebElement search =driver.findElement(By.xpath("//div[@class='a4bIc']//input"));
		search.sendKeys("Selenium.com");
		
		WebElement search1 =driver.findElement(By.xpath("//div[@jsname='VlcLAe']//input[1]"));
		search1.click();
		

	}

}
