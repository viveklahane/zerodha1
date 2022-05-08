package POM;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	@FindBy(xpath="//input[@icon='search']")private WebElement searchbox;
//	@FindBy(xpath="//ul[@class='omnisearch-results']//div//span[2]//span[2]")private List<WebElement> exchange;
	@FindBy(xpath="(//span[@class='tradingsymbol'])[1]")private WebElement addToWatchlist;
	@FindBy(xpath="//span[@class='symbol']//span//span")private List<WebElement> buyShearButton;
	
	public Home_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	public void clickOnSearchBox(String name)
	{
		searchbox.sendKeys(name);
	}
//	public void clickOnExchangeNSE(WebDriver driver, String exc ) throws InterruptedException
//	{
//		Thread.sleep(2000);
//		for(int i=0; i<exchange.size(); i++)
//		{
//			if(exchange.get(i).getText().equalsIgnoreCase(exc))
//			{
//				exchange.get(i).click();
//				Thread.sleep(1000);
//				WebElement clickOnNSE= driver.findElement(By.xpath("//span[@class='tradingsymbol']"));
//				WebElement clickOnNSE= driver.findElement(By.xpath("//span[@class='exchange-tag text-label text-label-outline NSE']"));
//				clickOnNSE.click();								
//			}
//		}
//	}
	public void clickOnAddtowatchlist()
	{
		addToWatchlist.click();
	}
	public void buyButton(WebDriver driver, String shearname) throws InterruptedException
	{
		
		for(int i=0; i<buyShearButton.size(); i++)
		{
			if(buyShearButton.get(i).getText().equalsIgnoreCase(shearname))
			{	
				buyShearButton.get(i).click();
				Thread.sleep(2000);
				WebElement clickonbuy = driver.findElement(By.xpath("//button[@class='button-blue buy']"));
				clickonbuy.click();				
			}
		}
	}

}
