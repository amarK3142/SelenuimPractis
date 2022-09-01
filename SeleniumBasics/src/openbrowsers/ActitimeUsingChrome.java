package openbrowsers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeUsingChrome {
       public static void main(String[] args) {
		String driverpath=System.getProperty("user.dir")+"\\Executables\\chromedriver.exe";
	    System.setProperty("webdriver.chrome.driver", driverpath);
	    WebDriver driver=new ChromeDriver();
        driver.get("https://www.actitime.com/");
        System.out.println(driver.getTitle());
        String PageTitle=driver.getTitle();
        String ExpectedTitle="actiTIME - Time Tracking Software for Smart Teams";
       System.out.println("Title validation:"+PageTitle.equals(ExpectedTitle));
        int Titlelength=driver.getTitle().length();
       System.out.println(Titlelength);
        String ExpectedUrl="https://www.actitime.com/";
        String appCurrentURL=driver.getCurrentUrl();
        System.out.println("Url Validation:"+appCurrentURL.equals(ExpectedUrl));
        System.out.println(driver.getPageSource());
        int Contentlength=driver.getPageSource().length();
        System.out.println("PageSourceLength:"+Contentlength);
        
        driver.close();
       
       
       
       
       }
}
