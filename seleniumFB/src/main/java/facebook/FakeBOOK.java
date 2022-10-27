package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FakeBOOK {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com/reg");
		
		WebElement fName =driver.findElement(By.xpath("//*[@id=\"u_0_b_0f\"]"));
		fName.sendKeys("krishna");
		WebElement lName =driver.findElement(By.xpath("//input[@name='lastname']"));
		lName.sendKeys("das");
		
		

	}

}
