package demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample 
{
 @Test
 public void test1()
 {
	 WebDriverManager.chromedriver().setup();
	 WebDriver driver = new ChromeDriver();
	 driver.get("https://www.Instagram.com");
 }
}
