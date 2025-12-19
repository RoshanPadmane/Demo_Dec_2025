package SeleniumLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

public class Locators3 {

	public static void main(String[] args) {
		//absolute xpath starts from root i.e html like /htlm with single slash
		//for parent to child traverse use / and from child to its brother i.e sibling then use following-sibling::
		//child to parent not possible in css its only possible in xpath
		//css is faster than xpath
		//System.setProperty("webdriver.chrome.driver", "/Users/rahulshetty/Documents/chromedriver");
		WebDriver driver = new ChromeDriver();
		//parent to child and child to sibling traverse

		// Sibling - Child to parent traverse
		//header/div/button[1]/following-sibling::button[1]

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).getText());
		System.out.println(driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText());
		driver.quit();

		}
}
