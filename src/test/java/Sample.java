

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Sample {

	public static void main(String[] args) {
//		String ProjectPath = System.getProperty("user.dir");
//		System.out.println("Project Path: "+ ProjectPath);
		System.setProperty("webdriver.gecko.driver", "G:\\geckodriver-v0.26.0-win32\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/");
	}
	
}
