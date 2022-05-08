package POM;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	

		@FindBy(xpath="//input[@label='User ID']")private WebElement userId;
		@FindBy(xpath="//input[@id='password']")private WebElement password;
		@FindBy(xpath="//button[@type='submit']")private WebElement login;
		@FindBy(xpath="//input[@label='PIN']")private WebElement pin;
		@FindBy(xpath="//button[@type='submit']")private WebElement submit;
		@FindBy(xpath="//a[text()='Forgot user ID or password?']")private WebElement forgot;
		@FindBy(xpath="//a[text()=\"Don't have an account? Signup now!\"]")private WebElement signup;
		
		public Login_page(WebDriver driver )
		{
			PageFactory.initElements(driver, this);
		}
		public void enteruserid(String id)
		{
			userId.sendKeys(id);
		}
		public void enterPassword(String pass)
		{
			password.sendKeys(pass);
		}
		public void clickOnLoginButton()
		{
			login.click();
		}
		public void enterPin(String pinid)
		{
			pin.sendKeys(pinid);
		}
		public void clickOnSubmitButton()
		{
			submit.click();
		}
		public void clickOnForgot()
		{
			forgot.click();
		}
		public void clickOnSignup(WebDriver driver)
		{
			signup.click();
			ArrayList<String> list = new ArrayList<String>(driver.getWindowHandles());
			driver.switchTo().window(list.get(1));
			WebElement mobileNo =driver.findElement(By.xpath("//input[@id='user_mobile']"));
			mobileNo.sendKeys("8862008131");
		}
	}

