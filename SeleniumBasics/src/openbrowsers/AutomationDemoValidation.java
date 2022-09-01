package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationDemoValidation {
     public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverpath);
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		String AppURL=driver.getCurrentUrl();
		String ExpectedURL="https://demo.automationtesting.in/Register.html";
		System.out.println("URL Validation:"+AppURL.equals(ExpectedURL));
		String AppTitle=driver.getTitle();
		String ExpectedTitle="Register";
		System.out.println("Title Validation:"+AppTitle.equals(ExpectedTitle));
		int Content=driver.getPageSource().length();
		System.out.println("Pagesource Length:"+Content);
		driver.close();		
	}
}
