package facebook;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakeScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "/users/krishnadas/downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.yahoo.com/");
		
		TakesScreenshot tc =(TakesScreenshot)driver;
	    
        File src = tc.getScreenshotAs(OutputType.FILE);
        File dest = new File("data/photo1.png");
        FileUtils.copyFile(src, dest);

	}

}
