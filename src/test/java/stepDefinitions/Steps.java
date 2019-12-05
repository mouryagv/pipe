package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import pageObject.LoginPage;

@SuppressWarnings("deprecation")
public class Steps {

	public WebDriver driver;
	public LoginPage lp;

	@Given("User Launch firefox browser")
	public void user_Launch_firefox_browser() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"//Drivers/geckodriver.exe");
		driver =new FirefoxDriver();
		lp = new LoginPage(driver);
	}

	@When("User opens URL {string}")
	public void user_opens_URL(String url) {
		driver.get(url);
		

	}

	@When("User enters Email as {string} and Password as {string}")
	public void user_enters_Email_as_and_Password_as(String email, String pass) throws InterruptedException {
		Thread.sleep(15000);
		lp.setUserName(email);
		lp.setPass(pass);
	}

	@When("Click on Login")
	public void click_on_Login() {
		lp.loginButton();

	}

	@Then("Page Title should be {string}")
	public void page_Title_should_be(String title) throws InterruptedException {
		if (driver.getPageSource().contains("Login was unsuccessfull.")){
			driver.quit();
			Assert.assertTrue(false);
		} else {
			Assert.assertEquals(title, driver.getTitle());

		}
		Thread.sleep(3000);
	}

	@When("User click on Log out link")
	public void user_click_on_Log_out_link() throws InterruptedException {
		lp.logoutButton();
		Thread.sleep(3000);
	}

	@Then("close browser")
	public void close_browser() {
		driver.quit();
	}



}
