package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookValidationChrome {
      public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
		System.setProperty("webdriver.chrome.driver",driverpath);
		WebDriver driver=new ChromeDriver();
	    driver.get("https://www.facebook.com/");
        String AppTitle=driver.getTitle();
	    String ExpectedTitle="Facebook – log in or sign up";
	    System.out.println("Title Validation:"+AppTitle.equals(ExpectedTitle));
	    System.out.println(driver.getTitle());
	    driver.close();

      }
}
