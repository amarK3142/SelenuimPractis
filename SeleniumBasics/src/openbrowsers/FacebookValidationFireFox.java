package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FacebookValidationFireFox {
	       public static void main(String[] args) {
			String driverpath=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
			System.setProperty("webdriver.gecko.driver",driverpath);
			WebDriver driver=new FirefoxDriver();
		    driver.get("https://www.facebook.com/");
		    String AppTitle=driver.getTitle();
		    String ExpectedTitle="Facebook – log in or sign up";
		    System.out.println("Title Validation:"+AppTitle.equals(ExpectedTitle));
		    System.out.println(driver.getTitle());
		    driver.close();
		}
	}


