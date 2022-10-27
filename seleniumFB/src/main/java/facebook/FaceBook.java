package facebook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		WebElement e =driver.findElement(By.xpath("//*[@id='email']"));
		e.sendKeys("daskrishnabd02@gmail.com");
		WebElement e1 =driver.findElement(By.xpath("//*[@id='pass']"));
		e1.sendKeys("pass2345");
		WebElement e2= driver.findElement(By.xpath("//button[@name='login']"));
		e2.click();
		

	}

}
