package SeleniumLearning;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");//from selenium 4.6.0 no need to write this line
		//there is inbuild jar is present for this seleniumManager like that
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("http://google.com");//wait until full page gets load
		driver.navigate().to("https://rahulshettyacademy.com");//not wait for full page to load

		driver.navigate().back();
		driver.navigate().forward();
		driver.quit();		
	}

}
