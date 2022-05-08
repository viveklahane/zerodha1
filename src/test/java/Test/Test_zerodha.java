package Test;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import POM.Home_page;
import POM.Login_page;
import Utility.Excel;
import Utility.Screen_shot;
import pojo.Browser;

public class Test_zerodha {
WebDriver driver;
	
	@BeforeMethod
	public void openbrowser()
	{
		driver=Browser.openbrowser("https://kite.zerodha.com/");
	}
	
	@Test
	public void loginWithVaildCridentials() throws EncryptedDocumentException, IOException, InterruptedException
	{
		Thread.sleep(3000);
		Login_page obj = new Login_page(driver);
		String userName = Excel.getdata1(0, 2, "USER_NAME");
		obj.enteruserid(userName);
		String password = Excel.getdata1(0, 2, "PASS_WORD");
		obj.enterPassword(password);
		obj.clickOnLoginButton();
		Thread.sleep(2000);
		String pin = Excel.getdata1(0, 2, "PIN");
		obj.enterPin(pin);
		obj.clickOnSubmitButton();
		Thread.sleep(3000);
		
		String shearname = Excel.getdata1(8, 0, "SHEAR_NAME");
		Home_page obj1 = new Home_page(driver);
		obj1.clickOnSearchBox(shearname);
		obj1.clickOnAddtowatchlist();
		Thread.sleep(3000);
		obj1.buyButton(driver, shearname);
		Thread.sleep(3000);
	}
	@Test
	public void forgotpassword() throws InterruptedException
	{
		Login_page obj = new Login_page(driver);
		obj.clickOnForgot();
		Thread.sleep(3000);
	}
	@Test
	public void signup() throws InterruptedException
	{
		Login_page obj = new Login_page(driver);
		obj.clickOnSignup(driver);
		Thread.sleep(3000);
		
	}
	@AfterMethod
	public void screenShot() throws IOException, InterruptedException
	{
		Screen_shot.get_Screenshot(driver, "abc");
		Thread.sleep(2000);
		//driver.close();
	}
}
