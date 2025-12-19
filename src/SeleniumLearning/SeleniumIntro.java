package SeleniumLearning;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class SeleniumIntro {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "E://chromedriver//chromedriver-win64//chromedriver-win64//chromedriver.exe");
		//instead of above, now WebDriverManager is come
		//https://googlechromelabs.github.io/chrome-for-testing/
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();//it closes current window
		driver.quit();//it closes all associated windows which are opened

	}

}
