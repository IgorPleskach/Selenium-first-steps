package best;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\Selenium webdriver\\chrome\\chromedriver.exe");
	WebDriver driver = new ChromeDriver(); 
	driver.get("https://uk-ua.facebook.com");
}
}
