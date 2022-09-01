package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ActitimeUsingFireFox {

	public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\Executables\\geckodriver.exe";
		System.setProperty("webdriver.gecko.driver", driverpath);
		WebDriver driver=new FirefoxDriver();
        driver.get("https://www.actitime.com/");
        System.out.println("Title :"+driver.getTitle());
        int TitleLenght=driver.getTitle().length();
        System.out.println("Length of Title:"+TitleLenght);
        String AppURL=driver.getCurrentUrl();
        String ExpectedURL="https://www.actitime.com/";
        System.out.println("URL Validation:"+AppURL.equals(ExpectedURL));
        int soucelength=driver.getPageSource().length();
        System.out.println("Page Length:"+soucelength);
        driver.close();
	
	
	}
}
