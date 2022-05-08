package pojo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {
	public static WebDriver openbrowser(String url)
	{
		System.setProperty("webdriver.chrome.driver", "D:\\automation class\\zerodhaAuto\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
//		driver.manage().window().maximize();
		return driver;
	}
}
