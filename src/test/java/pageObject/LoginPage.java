package pageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id = "Email")
	@CacheLookup
	WebElement txtEmail;
	
	@FindBy(id = "Password")
	@CacheLookup
	WebElement txtPass;
	
	@FindBy(xpath = "//input[@type='submit']")
	@CacheLookup
	WebElement btnLogin;
	
	@FindBy(linkText = "Logout")
	@CacheLookup
	WebElement btnlogout;
	
	public void setUserName(String uname){
		txtEmail.clear();
		txtEmail.sendKeys(uname);
		
	}
	
	public void setPass(String upass){
		txtPass.clear();
		txtPass.sendKeys(upass);		
	}
	
	public void loginButton(){
		btnLogin.click();
	}

	public void logoutButton(){
		btnlogout.click();
	}
}
